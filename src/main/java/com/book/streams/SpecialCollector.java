package com.book.streams;

import java.util.ArrayList;

public class SpecialCollector {
  static final String PATH = "/home/edrodrigues/LEARNING/JAVA/onjava/src/main/java/com/book/streams/Cheese.dat";
  public static void main(String[] args) throws Exception {
    ArrayList<String> words = 
      FileToWords.stream(PATH)
        .collect(
          ArrayList::new,
          ArrayList::add,
          ArrayList::addAll
        );
    
      words.stream()
        .filter(s -> s.equals("cheese"))
        .forEach(System.out::println);
  }
}
