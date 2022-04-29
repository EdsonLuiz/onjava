package com.book.operators;

public class Equivalence {
  static void show(String desc, Integer n1, Integer n2) {
    System.out.println("desc: " + desc);
    System.out.printf(
      "%d==%d %b %b%n", n1, n2, n1 == n2, n1.equals(n2)
    );
  }

  @SuppressWarnings("deprecation")
  public static void test(int value) {
    Integer i1 = value;
    Integer i2 = value;
    
    show("Automatic", i1, i2);

    // Old way, deprecated on Java 9 and on:
    Integer r1 = new Integer(value);
    Integer r2 = new Integer(value);
    show("new Integer() ", r1, r2);

    // Prefered way in Java 9 and on:
    Integer v1 = Integer.valueOf(value);
    Integer v2 = Integer.valueOf(value);
    show("Integer.valueOf() ", v1, v2);

    // Primitiver can't use equals
    int x = value;
    int y = value;
    // x.equals(y) doesn't compile
    System.out.println("Primitive int");
    System.out.printf("%d==%d %b%n", x, y, x==y);
  }

  public static void main(String[] args) {
    test(127);
    test(128);
  }
}
