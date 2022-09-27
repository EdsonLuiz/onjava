package com.book.streams;

import java.util.Arrays;

import com.book.interfaces.Operations;

public class Machine2 {
  public static void main(String[] args) {
    Arrays.stream(new Operations[] {
      () -> Operations.show("Bing"),
      () -> Operations.show("Crack"),
      () -> Operations.show("Twist"),
      () -> Operations.show("Pop")
    }).forEach(Operations::execute);
  }
}
