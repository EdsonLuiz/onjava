package com.book.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ApplesAndOrangesWithGenerics {
  public static void main(String[] args) {
    List<Apple> apples = new ArrayList<>();
    IntStream.range(0, 3)
      .forEach(i -> apples.add(new Apple(i, "red " + i)));

    for (Apple apple : apples) {
      System.out.println(apple.getName());
    }
  }
}
