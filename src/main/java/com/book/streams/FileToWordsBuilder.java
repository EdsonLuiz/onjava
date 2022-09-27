package com.book.streams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileToWordsBuilder {
  private static final String CHEESE_PATH = "/home/edrodrigues/LEARNING/JAVA/onjava/src/main/java/com/book/streams/Cheese.dat";
  Stream.Builder<String> builder = Stream.builder();

  public FileToWordsBuilder(String filePath) throws Exception {
    Files.lines(Paths.get(filePath))
      .skip(1)  // Skip the comment line at the begining
      .forEach(line -> {
        for(String w: line.split("[ .?,]+"))
          builder.add(w);
      });
  }

  Stream<String> stream() {
    return builder.build();
  }

  public static void main(String[] args) throws Exception {
    new FileToWordsBuilder(CHEESE_PATH).stream()
      .limit(7)
      .map(w -> w + " ")
      .forEach(System.out::print);
  }
}
