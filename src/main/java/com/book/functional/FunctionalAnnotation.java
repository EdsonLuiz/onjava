package com.book.functional;

@FunctionalInterface
interface Functional {
  String goodbye(String arg);
}

interface FunctionalNoAnn {
  String googbye(String arg);
}

/*
@FunctionalInterface
interface NotFunctional {
String goodbye(String arg);
String hello(String arg);
}
Produces error message:
NotFunctional is not a functional interface
multiple non-overriding abstract methods
found in interface NotFunctional
*/

public class FunctionalAnnotation {
  public String goodbye(String arg) {
    return "Goodbye, " + arg;
  }

  public static void main(String[] args) {
    FunctionalAnnotation fa = new FunctionalAnnotation();
    Functional f = fa::goodbye;
    FunctionalNoAnn fna = fa::goodbye;

    // Functional fac = fa; // Incompatible

    Functional fl = a -> "Goodbye, " + a;
    FunctionalNoAnn fnal = a -> "Goodbye, " + a;
  }
}
