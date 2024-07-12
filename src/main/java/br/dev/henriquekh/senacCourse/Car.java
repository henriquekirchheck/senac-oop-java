package br.dev.henriquekh.senacCourse;

public class Car {
  private String make = "Volkswagen";
  private String model = "Gol";
  private String color = "cinza";

  public void description() {
    System.out
        .println(String.format("O carro é de marca %s, do modelo %s e da cor %s", this.make, this.model, this.color));
  }

  Car() {
  }

  Car(String make, String model, String color) {
    this.make = make;
    this.model = model;
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
  }
}
