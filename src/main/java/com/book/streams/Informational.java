package com.book.streams;

public class Informational {
  static final String PATH = "/home/edrodrigues/LEARNING/JAVA/onjava/src/main/java/com/book/streams/Cheese.dat";
  public static void main(String[] args) throws Exception{
    System.out.println(FileToWords.stream(PATH).count());
    System.out.println(FileToWords.stream(PATH).min(String.CASE_INSENSITIVE_ORDER).orElse("NONE"));
    System.out.println(FileToWords.stream(PATH).max(String.CASE_INSENSITIVE_ORDER).orElse("NONE"));
  }
}
