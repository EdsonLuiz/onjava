package com.book.exceptions;

class Annoyance extends Exception {}

class Sneeze extends Annoyance {}

public class Human {
  public static void main(String[] args) {
    // Catch the exact type
    try {
      throw new Sneeze();
    } catch (Sneeze e) {
      System.out.println("Caught Sneeze");
    } catch (Annoyance e) {
      System.out.println("Caught Annoyance");
    }

    // Catch the base type.
    try {
      throw new Sneeze();
    } catch (Annoyance e) {
      System.out.println("Caught Annoyance");
    }
  }
}
