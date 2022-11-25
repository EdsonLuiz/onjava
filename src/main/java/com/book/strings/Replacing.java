package com.book.strings;

public class Replacing {
  static String s = Splitting.KNIGHTS;

  public static void main(String[] args) {
    System.out.println(s.replaceFirst("f\\w+", "located"));
    System.out.println(s.replaceAll("shrubbery|tree|herring", "banana"));
  }
}
