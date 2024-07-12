package br.dev.henriquekh.senacCourse;

public class Swimmer {
  String name;
  int age;

  Swimmer(String name, int age) throws IllegalArgumentException {
    if (age < 0) {
      throw new IllegalArgumentException("age must not be negative");
    }

    this.name = name;
    this.age = age;
  }
}
