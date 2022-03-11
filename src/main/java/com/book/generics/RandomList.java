package com.book.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class RandomList<T> extends ArrayList<T> {
  private Random rand = new Random(47);

  public T select() {
    return get(rand.nextInt(size()));
  }

  public static void main(String[] args) {
    RandomList<String> rs = new RandomList<>();
    String text = "The quick brow fox jumped over the lazy brow dog";
    int numberOfWords = text.split(" ").length;

    Arrays.stream(text.split(" "))
    .forEach(rs::add);;

    IntStream.range(0, numberOfWords)
      .forEach(i -> System.out.print(rs.select() + " "));
  }
}
