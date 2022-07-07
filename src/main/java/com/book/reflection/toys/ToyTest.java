package com.book.reflection.toys;

interface HasBetteries {}
interface Waterproof {}
interface Shoots {}

class Toy {
  public Toy() {}
  public Toy(int i) {}
}

class FancyToy extends Toy implements HasBetteries, Waterproof, Shoots {
  public FancyToy() {
    super(0);
  }
}

public class ToyTest {
  static void printInfo(Class cc) {
    System.out.println("Class name: " + cc.getName() + " is interface? " + "["+ cc.isInterface() + "]");
    System.out.println("Simple name: " + cc.getSimpleName());
    System.out.println("Canonical name: " + cc.getCanonicalName());
  }
  public static void main(String[] args) {
    Class c = null;

    try {
      c = Class.forName("com.book.reflection.toys.FancyToy");
    } catch (ClassNotFoundException e) {
      System.out.println("Can't find FancyToy");
      System.exit(1);
    }

    printInfo(c);
    // Class name: com.book.reflection.toys.FancyToy is interface? [false]
    // Simple name: FancyToy
    // Canonical name: com.book.reflection.toys.FancyToy

    for (Class face : c.getInterfaces()) {
      printInfo(face);
      // Class name: com.book.reflection.toys.HasBetteries is interface? [true]
      // Simple name: HasBetteries
      // Canonical name: com.book.reflection.toys.HasBetteries

      // Class name: com.book.reflection.toys.Waterproof is interface? [true]
      // Simple name: Waterproof
      // Canonical name: com.book.reflection.toys.Waterproof

      // Class name: com.book.reflection.toys.Shoots is interface? [true]
      // Simple name: Shoots
      // Canonical name: com.book.reflection.toys.Shoots
    }

    Class up = c.getSuperclass();
    Object obj = null;

    try {
      obj = up.newInstance();
    } catch (Exception e) {
      throw new RuntimeException("Cannot instantiate");
    }

    printInfo(obj.getClass());
    // Class name: com.book.reflection.toys.Toy is interface? [false]
    // Simple name: Toy
    // Canonical name: com.book.reflection.toys.Toy
  }
}
