package com.book.operators;

public class AutoInc {
  public static void main(String[] args) {
    int i = 1;

    System.out.println("i: " + i);
    System.out.println("++i: " + ++i); // pre-increment
    System.out.println("i++: " + i++); // post-increment

    System.out.println("i: " + i);
    System.out.println("--i: " + --i); // pre-decrement
    System.out.println("i--: " + i--); // pos-decrement
    System.out.println("i: " + i);
  }
}
