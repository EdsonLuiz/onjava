package com.book.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.IntStream;

public class SimpleCollection {
  public static void main(String[] args) {
    Collection<Integer> c = new ArrayList<>();

    IntStream.range(0, 10)
      .forEach(i -> c.add(i));

    c.forEach(System.out::println);

  }
}
