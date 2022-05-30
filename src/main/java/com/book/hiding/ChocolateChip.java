package com.book.hiding;

public class ChocolateChip extends Cookie {
  public ChocolateChip() {
    System.out.println("ChocolateChip constructor");
  }

  public void choomp() {
    // bite(); // Can't access bite
  }

  public static void main(String[] args) {
    ChocolateChip x = new ChocolateChip();
    x.choomp();
  }
}
