package com.book.reuse;

class Cleanser {
  private String s = "Cleanser";

  public void append(String a) {s += a;}
  public void dilute() {append(" dilute()");}
  public void apply() {append(" apply()");}
  public void scrub() {append(" scrub()");}

  @Override
  public String toString() {return s;}

  public static void main(String[] args) {
    Cleanser x = new Cleanser();
    x.dilute();
    x.apply();
    x.scrub();
    System.out.println(x);
  }
}

public class Detergent extends Cleanser {
  // change method
  @Override
  public void  scrub() {
    append(" Detergent.scrub()");
    // call the base class
    super.scrub();
  }

  // add methods to the interface
  public void foam() {
    append(" foam()");
  }

  // test new class 
  public static void main(String[] args) {
    Detergent x = new Detergent();
    x.dilute();
    x.apply();
    x.scrub();
    x.foam();
    System.out.println(x);
    System.out.println("Testing base class");
    Cleanser.main(args);
  }
}
