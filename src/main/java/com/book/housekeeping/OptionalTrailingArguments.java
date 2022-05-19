package com.book.housekeeping;

public class OptionalTrailingArguments {
  static void f(int required, String... trailing) {
    System.out.print("Required " + required + " ");
    for (String string : trailing) {
      System.out.print(string + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    f(1, "One");
    f(2, "Two");
    f(0);
  }

}