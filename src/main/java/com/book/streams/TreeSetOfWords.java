package com.book.streams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TreeSetOfWords {
  public static void main(String[] args) throws Exception {
    String location = "/home/edrodrigues/LEARNING/JAVA/onjava/src/main/java/com/book/streams/TreeSetOfWords.java";
    Set<String> words2 = Files.lines(Paths.get(location))
      .flatMap(s -> Arrays.stream(s.split("\\W+")))
      .filter(s -> !s.matches("\\d+")) // No numbers
      .map(String::trim)
      .filter(s -> s.length() > 2)
      .limit(100)
      .collect(Collectors.toCollection(TreeSet::new));

    System.out.println(words2);
  }
}
