package com.book.streams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileToWordsRegexp {
  private static final String CHEES_STRING = "/home/edrodrigues/LEARNING/JAVA/onjava/src/main/java/com/book/streams/Cheese.dat";
  private String all;

  public FileToWordsRegexp(String filePath) throws Exception {
    all = Files.lines(Paths.get(filePath))
      .skip(1)  // First (comment) line
      .collect(Collectors.joining(" "));
  }

  public Stream<String> stream() {
    return Pattern.compile("[ .,?]+").splitAsStream(all);
  }

  public static void main(String[] args) throws Exception{
    FileToWordsRegexp fw = new FileToWordsRegexp(CHEES_STRING);
    fw.stream()
      .limit(7)
      .map(w -> w + " ")
      .forEach(System.out::print);

    fw.stream()
      .skip(7)
      .limit(2)
      .map(w -> w + " ")
      .forEach(System.out::print);
  }
}
