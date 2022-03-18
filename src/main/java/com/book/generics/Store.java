package com.book.generics;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.IntStream;

import com.onjava.Suppliers;

public class Store extends ArrayList<Aisle> {
  private ArrayList<CheckoutStand> checkouts = new ArrayList<>();
  private Office office = new Office();
  public Store(int nAisles, int nShelves, int nProducts) {
    IntStream.range(0, nAisles)
      .forEach(n -> add(new Aisle(nShelves, nProducts)));
  }

  @Override public String toString() {
    StringBuilder result = new StringBuilder();
    for (Aisle a : this) {
      for (Shelf s : a) {
        for (Product p: s) {
          result.append(p);
          result.append("\n");
        }
      }
    }
    return result.toString();
  }
}

class Product {
  private final int id;
  private String description;
  private double price;

  Product(int idNumber, String descr, double price) {
    id = idNumber;
    description = descr;
    this.price = price;
  }

  @Override public String toString() {
    return id + ": " + description + ", price: $" + price;
  }

  public void priceChange(double change) {
    price += change;
  }

  public static Supplier<Product> generator = new Supplier<Product>() {
    private Random rand = new Random(47);

    @Override public Product get() {
      return 
        new Product(rand.nextInt(1000), "Test", Math.round(rand.nextDouble() * 1_000.0) + 0.99);
    }
  };
}

class Shelf extends ArrayList<Product> {
  Shelf(int nProducts) {
    Suppliers.fill(this, Product.generator, nProducts);
  }
}

class Aisle extends ArrayList<Shelf> {
  Aisle(int nShelves, int nProducts) {
    IntStream.range(0, nShelves)
      .forEach(n -> add(new Shelf(nProducts)));
  }
}

class CheckoutStand {}
class Office {}

