package com.book.interfaces;

abstract class Uninstatiable {
  abstract void f();
  abstract int g(); 
}
 
public class Instantiable extends Uninstatiable {

  @Override
  void f() {
    System.out.println("f()");
  }

  @Override
  int g() {
    return 22;
  }

  public static void main(String[] args) {
    Uninstatiable ui = new Instantiable();
  }
  
}
