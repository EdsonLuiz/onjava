package com.book.functional;

import java.util.function.Function;

/*
 * Using inheritance, you can easily create an alias for a specialized interface.
 */
interface FuncSS extends Function<String, String> {}

public class ProduceFunction {
  /**
   * With lambda expressions, it becomes almost effortless to create and
   * return a function from within a method.
   */
  static FuncSS produce() {
    return s -> s.toLowerCase();
  }

  public static void main(String[] args) {
    FuncSS f = produce();
    System.out.println(f.apply("YELLING"));
  }
}
