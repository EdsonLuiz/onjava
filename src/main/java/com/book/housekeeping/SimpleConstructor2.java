package com.book.housekeeping;

import java.util.stream.IntStream;

public class SimpleConstructor2 {
  public static void main(String[] args) {
    IntStream.range(0, 8)
      .forEach(p -> new Rock2(p));
  }
}

class Rock2 {
  Rock2(int i) {
    System.out.print("Rock " + i + " ");
  }
}
