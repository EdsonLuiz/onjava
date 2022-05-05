package com.book.housekeeping;

import java.util.stream.IntStream;

public class SimpleConstructor {
 public static void main(String[] args) {
   IntStream.range(0, 10)
    .forEach(p -> new Rock());
 }
}

class Rock {
  Rock() {
    System.out.print("Rock ");
  }
}
