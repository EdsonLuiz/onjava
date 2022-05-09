package com.book.housekeeping;

/**
 * calling contructors with this
 */
public class Flower {
  int petalCount = 0;
  String s = "Initial value";

  Flower(int petals) {
    petalCount = petals;
    System.out.println("Constructor with int arg only, petalCount = " + petalCount);
  }

  Flower(String ss) {
    System.out.println("Constructor with String arg only, petalCount = " + ss);
    s = ss;
  }

  Flower(String s, int petals){
    this(petals);
    this.s = s;
    System.out.println("String and int args");
  }

  Flower() {
    this("Hi", 47);
    System.out.println("Zero-argument constructor");
  }

  void printPetalCount() {
    System.out.println("petalCount = " + petalCount + " s = " + s);
  }

  public static void main(String[] args) {
    Flower x = new Flower();
    x.printPetalCount();
  }
}
