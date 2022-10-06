package com.book.streams;

public class FileToWordsTest {
  public static void main(String[] args) throws Exception{
    final String CHEESE = "/home/edrodrigues/LEARNING/JAVA/onjava/src/main/java/com/book/streams/Cheese.dat";

    FileToWordsB.stream(CHEESE)
      .limit(7)
      .forEach(s -> System.out.format("%s ", s));

    System.out.println();

    FileToWordsB.stream(CHEESE)
      .skip(7)
      .limit(2)
      .forEach(s -> System.out.format("%s ", s));
  }
}
