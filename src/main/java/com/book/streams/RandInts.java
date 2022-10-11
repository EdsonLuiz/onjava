package com.book.streams;

import java.util.Arrays;
import java.util.Random;

public class RandInts {
  private static int[] rints = new Random(47).ints(0, 1000).limit(100).toArray();

  public static IntStream rands() {
    return Arrays.stream(rints);
  }
}
