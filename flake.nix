{
  description = "A Nix-flake-based Java development environment";

  inputs = {
    nixpkgs.url = "github:NixOS/nixpkgs/nixos-unstable";
    flake-utils.url = "github:numtide/flake-utils";
  };

  outputs = { self, nixpkgs, flake-utils }:
    flake-utils.lib.eachDefaultSystem (system:
      let
        pkgs = import nixpkgs { inherit system; };

        jdk = pkgs.jdk;
        jre = pkgs.jre_minimal.override { inherit jdk; };

        nativeBuildInputs = with pkgs; [ maven jdk ];
        buildInputs = [ jre ];
      in {
        devShells = {
          default = pkgs.mkShell {
            inherit nativeBuildInputs buildInputs;

            NIX_LD_LIBRARY_PATH =
              pkgs.lib.makeLibraryPath [ pkgs.stdenv.cc.cc pkgs.openssl ];
            NIX_LD = pkgs.lib.fileContents
              "${pkgs.stdenv.cc}/nix-support/dynamic-linker";

            shellHook = ''
              ${jdk}/bin/java -version
            '';
          };
        };
        packages = {
          default = pkgs.maven.buildMavenPackage rec {
            pname = "senac-course";
            version = "1.0-SNAPSHOT";

            mvnHash = "sha256-t8grxedA+YCF7JeuvcYKD3u6KzSC6WY+IV3Tl4BbJ34=";

            src = ./.;

            nativeBuildInputs = [ pkgs.makeWrapper ];

            installPhase = ''
              mkdir -p $out/bin $out/share/${pname}
              install -Dm644 target/${pname}-${version}.jar $out/share/${pname}

              makeWrapper ${jre}/bin/java $out/bin/${pname} \
                --add-flags "-jar $out/share/${pname}/${pname}-${version}.jar"
            '';
          };
        };
      });
}
