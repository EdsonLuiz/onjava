package com.book.streams;

import static java.util.stream.IntStream.*;

public class Repeat {
  private Repeat() {}

  public static void repeat(int n, Runnable action) {
    range(0, n).forEach(i -> action.run());
  }
}
