package com.book.streams;

import java.util.stream.Stream;

public class StreamOf {
  public static void main(String[] args) {
    Stream.of(
      new Buble(1),
      new Buble(2),
      new Buble(3)
    )
    .forEach(System.out::println);

    Stream.of(
      "It`s ",
      "a ",
      "wonderful ",
      "day ",
      "for ",
      "a ",
      "pie!"
    )
    .forEach(System.out::println);;

    System.out.println();

    Stream.of(3.14159, 2.718, 1.618)
      .forEach(System.out::println);
  }
}
