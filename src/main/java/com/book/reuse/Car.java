package com.book.reuse;

class Engine {
  public void start() {}
  public void rev() {}
  public void stop() {}
}

class Whell {
  public void inflate(int psi) {}
}

class Window {
  public void rollup() {}
  public void rolldown() {}
}

class Door {
  public Window window = new Window();
  public void open() {}
  public void close() {}
}

/*
 * Composition with public objects
 */
public class Car {
  public Engine engine = new Engine();
  public Whell[] whell = new Whell[4];
  public Door
    left = new Door(),
    right = new Door();
  public Car() {
    for(int i = 0; i < 4; i++)
      wheel[i] = new Wheel();
  }

  public static void main(String[] args) {
    Car car = new Car();
    car.left.window.rolldown();
    car.whell[0].inflate(72);
  }
}
