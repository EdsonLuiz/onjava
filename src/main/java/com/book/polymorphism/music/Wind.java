package com.book.polymorphism.music;

/*
 * Wind objects are Instruments
 * because they have the same interface
 */
public class Wind extends Instrument {
  // Redefine interface method:
  @Override
  public void play(Note n) {
    System.out.println("Wind play() " + n);
  }
}
