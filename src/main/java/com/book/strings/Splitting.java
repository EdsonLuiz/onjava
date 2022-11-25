package com.book.strings;

import java.util.Arrays;

public class Splitting {
  public static final String KNIGHTS = "Then, when you have found the shrubbery, "+
    "you must cut down the mightiest tree in the " +
    "forest...with... a herring!";

    public static void split(String regex) {
      System.out.println(
        Arrays.toString(KNIGHTS.split(regex))
      );
    }

    public static void main(String[] args) {
      split(" ");     // Doesn't have to contain regex chars
      split("\\W");   // Non-word characters
      split("n\\W+"); // 'n' followed by non-words
    }
}
