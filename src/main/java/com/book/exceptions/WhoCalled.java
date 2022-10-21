package com.book.exceptions;


public class WhoCalled {
  static void f() {
    try {
      throw new Exception();
    } catch (Exception e) {
      System.out.println("Possible error in: " + e.getStackTrace()[0].getClassName() + e.getStackTrace()[0].getMethodName() + "()");
      for (StackTraceElement ste : e.getStackTrace()) {
        System.out.println(ste.getMethodName());
      }
    }
  }

  static void g() {f();}
  static void h() {g();}

  public static void main(String[] args) {
    f();
    System.out.println("====");
    g();
    System.out.println("====");
    h();
  }

}
