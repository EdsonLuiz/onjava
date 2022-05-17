package com.book.housekeeping;

import java.util.stream.IntStream;

public class ArraysOfPrimitives {
  public static void main(String[] args) {
    int[] a1 = {1, 2, 3, 4, 5};
    int[] a2;

    a2 = a1;

    IntStream.range(0, a2.length)
      .forEach(i -> a2[i] += 1);

    IntStream.range(0, a2.length)
      .forEach(i -> System.out.println("a1[" + i + "] = " + a1[i]));
  }  
}
