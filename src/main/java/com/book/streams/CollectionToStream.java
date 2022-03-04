package com.book.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionToStream {
  public static void main(String[] args) {
    List<Bubble> bubbles = new ArrayList<>();
    Collections.addAll(bubbles, new Bubble(1), new Bubble(2), new Bubble(3));

    System.out.println(
      bubbles.stream()
        .mapToInt(b -> b.getId())
        .sum()
    );

    Set<String> w = new HashSet<>();
    Collections.addAll(w, "It`s a wonderful day for pie!".split(" "));

    w.stream()
      .map(x -> x + " ")
      .forEach(System.out::print);

    System.out.println();

    Map<String, Double> m = new HashMap<>();
    m.put("pi", 3.14159);
    m.put("e", 2.718);
    m.put("phi", 1.618);

    m.entrySet().stream()
      .map(e -> e.getKey() + ": " + e.getValue())
      .forEach(System.out::println);
  }
}
