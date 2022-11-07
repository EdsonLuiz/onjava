package com.book.exceptions;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamsAreAutoCloseable {
  public static void main(String[] args) throws IOException{
    try (
      Stream<String> in = Files.lines(Paths.get("/home/edrodrigues/LEARNING/JAVA/onjava/src/main/java/com/book/exceptions/StreamsAreAutoCloseable.java"));
      PrintWriter outfile = new PrintWriter("/home/edrodrigues/LEARNING/JAVA/onjava/src/main/java/com/book/exceptions/results.txt");
    ) {
      in.skip(5)
        .limit(1)
        .map(String::toLowerCase)
        .forEachOrdered(outfile::println);
    } 
  }
}
