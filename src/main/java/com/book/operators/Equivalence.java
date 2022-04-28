package com.book.operators;

public class Equivalence {
  static void show(String desc, Integer n1, Integer n2) {
    System.out.println("desc: " + desc);
    System.out.println(
      "%d==%d %b %b%n", n1, n2, n1 == n2, n1.equals(n2)
    );
  }
}
