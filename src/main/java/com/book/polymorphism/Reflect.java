package com.book.polymorphism;

class Useful {
  public void f() {}
  public void g() {}
}

class MoreUserful extends Useful {
  @Override
  public void f() {}

  @Override
  public void g() {}

  public void u() {}
  public void v() {}
  public void w() {}
}

public class Reflect {
  public static void main(String[] args) {
    Useful[] x = {
      new Useful(),
      new MoreUserful()
    };

    x[0].f();
    x[1].g();

    // Compile time: method not foud in Usefull:
    // x[1].u();

    ((MoreUserful)x[1]).u();  // Dowcast/ Reflect
    ((MoreUserful)x[0]).u();  // Exception throw
  }
}
