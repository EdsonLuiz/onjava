package com.book.streams;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class OptionalMap {
  static String[] elements = {"12", "", "23", "45"};
  static Stream<String> testStream() {
    return Arrays.stream(elements);
  }

  static void test(String descr, Function<String, String> func) {
    System.out.println(" ---( " + descr + " )--- ");
    for(int i = 0; i <= elements.length; i++) {
      System.out.println(
        testStream()
          .skip(i)
          .findFirst()
          .map(func)
      );
    }
  }

  public static void main(String[] args) {
    // If the Optional is not empty, map() first extracts
    // the contents which it then passes
    // to the function

    test("Add brackets", s -> "[" + s + "]");
    test("Increment", s -> {
      try {
        return Integer.parseInt(s) + 1 + "";
      } catch (NumberFormatException e) {
        return s;
      }
    });
    test("Replace", s -> s.replace("2", "9"));
    test("take last digit", s -> s.length() > 0 ? s.charAt(s.length() -1) + "" : s);

    // After the function is finished, map() wraps the
    // result in an Optional before returning it:
  }
}
