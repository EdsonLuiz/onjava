package com.book.streams;

import java.util.stream.Stream;

public class Bubbles {
  public static void main(String[] args) {
    Stream.generate(BubbleB::bubblerb)
      .limit(5)
      .forEach(System.out::println);
  }
}
