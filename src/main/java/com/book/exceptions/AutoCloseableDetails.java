package com.book.exceptions;

class Reporter implements AutoCloseable {
  String name = getClass().getSimpleName();

  Reporter() {
    System.out.println("Creating " + name);
  }

  @Override
  public void close() throws Exception {
    System.out.println("Closing " + name);
  }
}

class Fisrt extends Reporter {}
class Second extends Reporter {}

public class AutoCloseableDetails {
  public static void main(String[] args) {
    try (
      Fisrt f = new Fisrt();
      Second s = new Second();
    ) {
      
    } catch (Exception e) {
      // TODO: handle exception
    }
  }
}
