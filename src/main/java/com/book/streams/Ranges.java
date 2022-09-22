package com.book.streams;

import static java.util.stream.IntStream.*;

public class Ranges {
  public static void main(String[] args) {
    // traditional way
    int result = 0;
    for (int i = 10; i < 20; i++) {
      result += i;
      System.out.println(result);
    }
    System.out.println("====");

    // for-in with range
    result = 0;
    for (int i : range(10, 20).toArray()) {
      result += i;
      System.out.println(result);
    }
    System.out.println("====");

    // Use streams
    System.out.println(range(10, 20).sum());
    System.out.println("====");
  }

}
