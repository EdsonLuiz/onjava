package com.book.interfaces.music5;

import com.book.polymorphism.music.Note;

interface Instrument {
  // Compile-time constant:
  int VALUE = 5;  // static & final

  default void play(Note n) {
    System.out.println(this + ".play() " + n);
  }

  default void adjust() {
    System.out.println("Adjusting " + this);
  }
}

class Wind implements Instrument {
  @Override
  public String toString() {
    return "Wind";
  }
}

class Percursion implements Instrument {
  @Override
  public String toString() {
    return "Percursion";
  }
}

class Stringed implements Instrument {
  @Override
  public String toString() {
    return "Stringed";
  }
}

class Brass extends Wind {
  @Override
  public String toString() {
    return "Brass";
  }
}

class WoodWind extends Wind {
  @Override
  public String toString() {
    return "WoodWind";
  }
}

public class Music5 {
  // Doesn't care about type, so new types
  // added to the system still work right:
  static void tune(Instrument i) {
    i.play(Note.MIDDLE_C);
  }

  static void tuneAll(Instrument[] e) {
    for (Instrument i : e)
      tune(i);
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
