package br.dev.henriquekh.senacCourse;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
        Car car = new Car("Toyota", "Corolla", "preta");
        Swimmer swimmer = new Swimmer("Vitoria", 19);

        car.description();

        System.out.println(String.format("Nadador(a):\n\tNome: %s\n\tIdade: %d", swimmer.name, swimmer.age));
    }
}
