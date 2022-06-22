package com.book.polymorphism.music;

/*
 * Inheritance and upcasting
 * 
 * The method Music.tune() accepts an Instrument reference but also anything 
 * derived from Instrument
 */
public class Music {
  public static void tune(Instrument i) {
    i.play(Note.MIDDLE_C);
  }

  public static void main(String[] args) {
    Wind flute = new Wind();
    tune(flute); //  upcasting
  }
}
