package com.book.interfaces.music4;

import com.book.polymorphism.music.Note;

abstract class Instrument {
  private int i;
  
  public abstract void play(Note n);
  public String what() {return "Instrument";}
  public abstract void adjust();
}

class Wind extends Instrument {

  @Override
  public void play(Note n) {
    System.out.println("Wind.play() " + n);
  }

  @Override
  public String what() {
    return "Wind";
  }

  @Override
  public void adjust() {
    System.out.println("Adjusting " + what());
  }
}

class Percursion extends Instrument {

  @Override
  public void play(Note n) {
    System.out.println("Percursion.play() " + n);
  }

  @Override
  public String what() {
    return "Percursion";
  }

  @Override
  public void adjust() {
    System.out.println("Adjusting " + what());
  }
}

class Stringed extends Instrument {

  @Override
  public void play(Note n) {
    System.out.println("Stringed.play() " + n);
  }

  @Override
  public String what() {
    return "Stringed";
  }

  @Override
  public void adjust() {
    System.out.println("Adjusting " + what());
  }
}

class Brass extends Wind {
  @Override
  public void play(Note n) {
    System.out.println("Brass.play() " + n);
  }
  
  @Override
  public void adjust() {
    System.out.println("Adjusting Brass");
  }
}

class WoodWind extends Wind {
  @Override
  public void play(Note n) {
    System.out.println("WoodWind.play() " + n);
  }

  @Override
  public void adjust() {
    System.out.println("Adjusting WoodWind");
  }
}

public class Music4 {
  static void tune(Instrument i) {
    i.play(Note.MIDDLE_C);
  }

  static void tuneAll(Instrument[] e) {
    for (Instrument i : e) {
      tune(i);
    }
  }

  public static void main(String[] args) {
    Instrument[] orchestra = {
      new Wind(),
      new Percursion(),
      new Stringed(),
      new Brass(),
      new WoodWind()
    };

    tuneAll(orchestra);
  }
}
