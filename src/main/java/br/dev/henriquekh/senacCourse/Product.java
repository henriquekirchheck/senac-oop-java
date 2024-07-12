package br.dev.henriquekh.senacCourse;

public class Product {
  private String name;
  private float price;
  private int quantity;

  Product(String name, float price, int quantity) throws IllegalArgumentException {
    if (quantity < 0) {
      throw new IllegalArgumentException("quantity must not be negative");
    }
    if (price < 0) {
      throw new IllegalArgumentException("price must not be negative");
    }

    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public String getName() {
    return name;
  }

  public float getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }
}
