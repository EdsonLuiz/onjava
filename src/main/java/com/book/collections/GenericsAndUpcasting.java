package com.book.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class GrannySmith extends Apple {};
class Gala extends Apple {};
class Fuji extends Apple {};
class Braeburn extends Apple {};

public class GenericsAndUpcasting {
  public static void main(String[] args) {
    List<Apple> apples = new ArrayList<>(Arrays.asList(
      new GrannySmith(),
      new Gala(),
      new Fuji(),
      new Braeburn()
    ));

    for (Apple apple : apples) {
      System.out.println(apple);
    }
    
  }
}
