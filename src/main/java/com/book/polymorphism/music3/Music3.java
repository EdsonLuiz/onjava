package com.book.polymorphism.music3;

import com.book.polymorphism.music.Note;

class Instrument {
  void play(Note n) {
    System.out.println("Instrument.play() " + n);
  }

  String what() {return "Instrument";}
  
  void adjust() {
    System.out.println("Adjust Instrument");
  }
}

class Wind extends Instrument {
  @Override
  void play(Note n) {
    System.out.println("Wind.play() "+ n);
  }

  @Override
  String what() {
    return "Wind";
  }

  @Override
  void adjust() {
    System.out.println("Adjusting Wind");
  }
}

class Percursion extends Instrument {
  @Override
  void play(Note n) {
    System.out.println("Percursion.play() "+ n);
  }

  @Override
  String what() {
    return "Percursion";
  }

  @Override
  void adjust() {
    System.out.println("Adjusting Percursion");
  }
}

class Stringed extends Instrument {
  @Override
  void play(Note n) {
    System.out.println("Stringed.play() "+ n);
  }

  @Override
  String what() {
    return "Stringed";
  }

  @Override
  void adjust() {
    System.out.println("Adjusting Stringed");
  }
}

class Brass extends Wind {
  @Override
  void play(Note n) {
    System.out.println("Brass.play() "+ n);
  }

  @Override
  void adjust() {
    System.out.println("Adjusting Brass");
  }
}

class Woodwind extends Wind {
  @Override
  void play(Note n) {
    System.out.println("Woodwind.play() "+ n);
  }

  @Override
  String what() {
    return "Woodwind";
  }
}

/*
 * An extensible program
 */
public class Music3 {
  // Dosen't care about type, so new types
  // added to the system still work right
  public static void tune(Instrument i) {
    // ..
    i.play(Note.MIDDLE_C);
  }

  public static void tuneAll(Instrument[] e) {
    for (Instrument instrument : e) {
      tune(instrument);
    }
  }

  public static void main(String[] args) {
    // Upcasting during addition to the array
    Instrument[] orchestra = {
      new Wind(),
      new Percursion(),
      new Stringed(),
      new Brass(),
      new Woodwind()
    };

    tuneAll(orchestra);
  }
}
