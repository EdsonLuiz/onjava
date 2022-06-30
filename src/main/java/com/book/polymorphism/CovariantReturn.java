package com.book.polymorphism;

class Grain {
  @Override
  public String toString() {
    return "Grain";
  }
}

class Wheat extends Grain {
  @Override
  public String toString() {
    return "Wheat";
  }
}

class Mill {
  Grain process() {
    return new Grain();
  }
}

class WheatMill extends Mill {
  @Override
  Grain process() {
    return new Wheat();
  }
}

/*
 * Means an overriden method in a derived class
 * can return a type derived from the type returned
 * by the base-class method
 */
public class CovariantReturn {
  public static void main(String[] args) {
    Mill m = new Mill();
    Grain g = m.process();
    System.out.println(g);
    m = new WheatMill();
    g = m.process();
    System.out.println(g);
  } 
}
