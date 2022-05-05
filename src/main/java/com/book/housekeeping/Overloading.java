package com.book.housekeeping;

import java.util.stream.IntStream;

class Tree {
  int height;

  Tree() {
    System.out.println("Planting seedling");
    height = 0;
  }

  Tree(int initialHeight) {
    height = initialHeight;
    System.out.println("Creating new tree that is " + height + " feel tall");
  }

  void info() {
    System.out.println("Tree is " + height + " feet tall");
  }

  void info(String s) {
    System.out.println(s + ": Tree is " + height + " feet tall ");
  }
}

public class Overloading {
  public static void main(String[] args) {
    IntStream.range(0, 5)
      .forEach(i -> {
        Tree t = new Tree(i);
        t.info();
        t.info("Overloaded method");
      });
      new Tree();
  }
}
