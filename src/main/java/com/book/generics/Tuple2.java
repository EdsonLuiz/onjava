package com.book.generics;
/**
 * tuple concept.
 * create an object that holds multiple objects,
 * and return that object.
 * also called a Data Transfer Object or Messenger.
 */
public class Tuple2<A, B> {
  public final A a1;
  public final B b1;

  public Tuple2(A a, B b) {a1 = a; b1 = b;}

  public String rep() {
    return a1 + ", " + b1;
  }

  @Override
  public String toString() {
    return "(" + rep() + ")";
  }

  
}
