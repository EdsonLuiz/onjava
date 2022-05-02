package com.book.operators;

/**
 * Default equals() does not compare contents
 */

class ValA {
  int i;
}

class ValB {
  int i;

  // Works for this exampla, not a complete equals
  public boolean equals(Object o) {
    ValB rVal = (ValB) o; // casts o to be a ValB
    return i == rVal.i;
  }
}

public class EqualsMethod {
  public static void main(String[] args) {
    ValA val1 = new ValA();
    ValA val2 = new ValA();
    val1.i = val2.i = 100;
    System.out.println(val1.equals(val2));

    ValB vb1 = new ValB();
    ValB vb2 = new ValB();
    vb1.i = vb2.i = 100;
    System.out.println(vb1.equals(vb2));
  }
}
