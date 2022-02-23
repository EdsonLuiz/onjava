package com.book.control;

public class WhileTest {
  static boolean condition() {
    boolean resut = Math.random() < 0.99;
    System.out.println(resut + ", ");
    return resut;
  }

  public static void main(String[] args) {
    while(condition())
      System.out.println("Inside while");

    System.out.println("Outside while");
  }
}
