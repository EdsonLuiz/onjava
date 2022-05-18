package com.book.housekeeping;

class A {}

public class VarArgs {
  public static void pritArray(Object[] args) {
    for (Object object : args) {
      System.out.print(object + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    pritArray(new Object[] {47, (float) 3.14, 11.11});
    pritArray(new Object[] {"one", "two", "three"});
    pritArray(new Object[] {new A(), new A(), new A()});
  }
}
