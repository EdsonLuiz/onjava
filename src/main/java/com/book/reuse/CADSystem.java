package com.book.reuse;

import java.util.stream.IntStream;

class Shape {
  Shape(int i) {
    System.out.println("Shape constructor");
  }

  void dispose() {
    System.out.println("Shape dispose");
  }
}

class Circle extends Shape {
  Circle(int i) {
    super(i);
    System.out.println("Drawing Circle");
  }

  @Override
  void dispose() {
    System.out.println("Erase Circle");
    super.dispose();
  }
}

class Triangle extends Shape {

  Triangle(int i) {
    super(i);
    System.out.println("Drawing Triangle");
  }

  @Override
  void dispose() {
    System.out.println("Erase Triangle");
    super.dispose();
  }

}

class Line extends Shape {

  private int start;
  private int end;

  Line(int start, int end) {
    super(start);
    this.start = start;
    this.end = end;
    System.out.println("Drawing Line: " + start + ", " + end);
  }

  @Override
  void dispose() {
    System.out.println("Erasing Line: " + start + ", " + end);
    super.dispose();
  }

}

public class CADSystem extends Shape {

  private Circle c;
  private Triangle t;
  private Line[] lines = new Line[3];

  public CADSystem(int i) {
    super(i + 1);
    IntStream.range(0, lines.length).forEach(this::combine);
  }

  private void combine(int val) {
    lines[val] = new Line(val, val * val);
    c = new Circle(val);
    t = new Triangle(val);
    System.out.println("Combined constructor");
  }

  @Override
  void dispose() {
    System.out.println("CADSystem.dispose()");
    // The order of cleanup is the reverse order
    // of the order of initialization
    t.dispose();
    c.dispose();
    for(int i = lines.length - 1; i >= 0; i--)
      lines[i].dispose();

    super.dispose();
  }

  public static void main(String[] args) {
    CADSystem x = new CADSystem(47);

    try {
      // code
    } finally {
      x.dispose();
    }
  }
  
}
