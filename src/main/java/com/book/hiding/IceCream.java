package com.book.hiding;

class Sundae {
  private Sundae() {}
  static Sundae makeASundae() {
    return new Sundae();
  }
}

public class IceCream {
  public static void main(String[] args) {
    // Sundae sundae = new Sundae();
    Sundae x = Sundae.makeASundae();
  }
}
