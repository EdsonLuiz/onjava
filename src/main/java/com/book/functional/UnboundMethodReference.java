package com.book.functional;

class X {
  String f() {return "X::f()";}
}

interface MakeString {
  String make();
}

interface TransformX {
  String transform(X x);
}

public class UnboundMethodReference {
  public static void main(String[] args) {
    // MakeString ms = X::f;  [1]

    TransformX sp = X::f;
    X x = new X();

    System.out.println(sp.transform(x));  // [2]
    System.out.println(x.f());            // same effect
  }

  /*
   * [1] Attempting to assign to a MakeString resulting in an "invalid method reference".
   *    You can't call f() without an X object to call it upon.
   *    X::f reprsents an unbound method reference, because it hasn't been "bound" to an object.
   * 
   * [2] Take an unbuound reference and call transform() on it, passinf it an X, and somehow that
   *    results in the call to x.f().
   *    Java knows it must take the first argument, effectively this, and call the method on it.
   */
}
