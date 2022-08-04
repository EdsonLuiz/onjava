package com.book.interfaces;

abstract class Basic3 {
  int f() {return 111;}
  // No abstract mehtods.
}

public class AbstractWithoutAbstracts {
  // Basic3 be = new Basic3();
  // error: Basic3 is abstract; cannot be instantiated
}
