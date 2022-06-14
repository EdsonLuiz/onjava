// "Blank" final fields
package com.book.reuse;

class Poppet {
  private int i;
  Poppet(int i) {this.i = i;}
}

public class BlankFinal {
  private final int i = 0;  // Initialized final 
  private final int j;      // Blank final
  private final Poppet p;   // Blank fina reference

  // Blank final MUST be initialized in constructor
  public BlankFinal() {
    j = 1;              // initialize blank final 
    p = new Poppet(i);  // Init blank final reference
  }

  public BlankFinal(int x) {
    j = x;              // initialize blank final
    p = new Poppet(x);  // Init blank final reference
  }

  public static void main(String[] args) {
    new BlankFinal();
    new BlankFinal(47);
  }
}
