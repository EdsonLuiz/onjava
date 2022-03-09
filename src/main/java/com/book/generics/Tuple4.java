package com.book.generics;

public class Tuple4<A, B, C, D> extends Tuple3<A, B, C> {
  public final D a4;

  public Tuple4(A a, B b, C c, D d) {
    super(a, b, c);
    this.a4 = d;
  }

  @Override
  public String rep() {
    return super.rep() + ", " + this.a4;
  }
}
