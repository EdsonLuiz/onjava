package com.book.functional;

import java.util.function.IntSupplier;

public class Closure2 {
  /**
   * Not possible increment x or i
   * x++ nor i++ not work.
   * 
   * local variables referenced from a lambda
   * expression must be final or effectively final.
   * 
   * A local variable is effectively final if its initial value is
   * never changed.
   */
  IntSupplier makeFun(int x) {
    int i = 0;
    return () -> x + i;
  }
}
