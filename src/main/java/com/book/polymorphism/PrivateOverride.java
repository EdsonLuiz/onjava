package com.book.polymorphism;

/**
 * Trying to override a private method
 */
public class PrivateOverride {
  private void f() {
    System.out.println("private f()");
  }

  public static void main(String[] args) {
    PrivateOverride po = new Derived();
    po.f();
  }
}

class Derived extends PrivateOverride {
  /*
   * Use a different name from a private base-class method 
   * in your derived class.
   * @Override annotation, detect the problem as well.
   */
  public void f() {
    System.out.println("public f()");
  }
}
