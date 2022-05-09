package com.book.housekeeping;

class Person {
  public void eat(Apple apple) {
    Apple peeled = apple.getPeeled();
    System.out.println("Yummy");
  }
}

class Peeler {
  static Apple peel(Apple apple) {
    // remove peel
    return apple; // this apple is peeled
  }
}

class Apple {
  Apple getPeeled() {
    return Peeler.peel(this);
  }
}

public class PassingThis {
  public static void main(String[] args) {
    new Person().eat(new Apple());
  }
}
