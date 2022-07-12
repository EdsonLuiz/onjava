package com.book.reflection;

import java.util.stream.Stream;

public class ID2 {
  // The constructor has the same access modifier as the class
  // in this case automatically-generated zero-argument constructor is public.
  // Don't need to explicitly define it.
  private static long counter;
  private final long id = counter++;

  @Override
  public String toString() {
    return Long.toString(id);
  }

  public static void main(String[] args) {
    Stream.generate(new DynamicSupplier<>(ID2.class))
      .skip(10)
      .limit(5)
      .forEach(System.out::println);
  }
}
