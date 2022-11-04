package com.book.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class InputFile2 {
  private String fname;

  public InputFile2(String fname) {
    this.fname = fname;
  }

  public Stream<String> getLines() throws IOException {
    return Files.lines(Paths.get(fname));
  }

  public static void main(String[] args) throws IOException{
    new InputFile2("/home/edrodrigues/LEARNING/JAVA/onjava/src/main/java/com/book/exceptions/InputFile2.java").getLines()
      .skip(15)
      .limit(1)
      .forEach(System.out::println);
  }
}
