package com.book.exceptions;

class CloseException extends Exception {}

class Reporter2 implements AutoCloseable {
  String name = getClass().getSimpleName();

  Reporter2() {
    System.out.println("Creating " + name);
  }

  @Override
  public void close() throws Exception {
    System.out.println("Closing " + name);
  }
}

class Closer extends Reporter2 {
  @Override
  public void close() throws Exception {
    super.close();
    throw new CloseException();
  }
}

public class CloseExceptions {
  public static void main(String[] args) throws Exception {
    try (
      Fisrt f = new Fisrt();
      Closer c = new Closer();
      Second s = new Second();
    ) {
      System.out.println("In body");
    } catch (CloseException e) {
      System.out.println("Caught: " + e);
    }
  }
}
