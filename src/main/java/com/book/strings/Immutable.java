package com.book.strings;

public class Immutable {
  public static String upcase(String s) {
    return s.toUpperCase();
  }

  public static void main(String[] args) {
    String q = "Hondi";
    System.out.println(q); // Hondi

    String qq = upcase(q);
    System.out.println(qq); // HONDI 

    System.out.println(q); // Hondi
  }
}
