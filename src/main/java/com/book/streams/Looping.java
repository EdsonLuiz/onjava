package com.book.streams;

import java.util.logging.Logger;

public class Looping {
  private static Logger log = Logger.getLogger(Looping.class.getSimpleName());
  static void hi() {
    System.out.println("Hi!");
  }

  public static void main(String[] args) {
    log.info("message");
    Repeat.repeat(3, () -> log.info("Looping!"));
    Repeat.repeat(2, Looping::hi);
  }
}
