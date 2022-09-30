package com.book.streams;

import java.util.Comparator;

public class SortedComparator {
  private static final String CHEESE_PATH = "/home/edrodrigues/LEARNING/JAVA/onjava/src/main/java/com/book/streams/Cheese.dat";
  public static void main(String[] args) throws Exception{
    FileToWords.stream(CHEESE_PATH)
      .skip(10)
      .limit(10)
      .sorted(Comparator.reverseOrder())
      .map(w -> w + " ")
      .forEach(System.out::print);
  }
}
