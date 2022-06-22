package com.book.polymorphism;

import com.book.polymorphism.shape.RandomShapes;
import com.book.polymorphism.shape.Shape;

public class Shapes {
  public static void main(String[] args) {
    RandomShapes gen = new RandomShapes();
    // Make polymorphic method calls:
    for(Shape shape: gen.array(9)) {
      shape.draw();
    }
  }
}
