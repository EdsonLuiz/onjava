package com.book.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TryWithResources {
  public static void main(String[] args) {
    try (InputStream in = new FileInputStream(new File("/home/edrodrigues/LEARNING/JAVA/onjava/src/main/java/com/book/exceptions/TryWithResources.java"))) {
      int contents = in.read();
      // Process contents...
    } catch (IOException e) {
      // Handle the error
    }
  }
}
