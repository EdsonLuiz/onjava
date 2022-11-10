package com.book.exceptions;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class MainException {
  // Pass exceptions to the console
  public static void main(String[] args) throws Exception{
    // Open the file:
    List<String> files = Files.readAllLines(Paths.get("/home/edrodrigues/LEARNING/JAVA/onjava/src/main/java/com/book/exceptions/MainException.java"));
    // Use the file
  }
}
