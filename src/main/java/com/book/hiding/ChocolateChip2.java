package com.book.hiding;

import com.book.hiding.cookie2.Cookie;

public class ChocolateChip2 extends Cookie {
  public ChocolateChip2() {
    System.out.println("ChocolateChip2 constructor");
  }

  public void choomp() {
    bite();
  }

  public static void main(String[] args) {
    ChocolateChip2 x = new ChocolateChip2();
    x.choomp();
  } 
}
