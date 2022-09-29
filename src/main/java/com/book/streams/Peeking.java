package com.book.streams;

public class Peeking {
  static final String CHEESE_PATH = "/home/edrodrigues/LEARNING/JAVA/onjava/src/main/java/com/book/streams/Cheese.dat";
  public static void main(String[] args) throws Exception{
    FileToWords.stream(CHEESE_PATH)
      .skip(21)
      .limit(4)
      .map(w -> w + " ")
      .peek(System.out::print)
      .map(String::toUpperCase)
      .peek(System.out::print)
      .map(String::toLowerCase)
      .forEach(System.out::print);
  }
}
