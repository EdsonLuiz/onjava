package com.book.interfaces;

/*
 * This is a version of template method.
 * runOps is the template method.
 */
public interface Operations {
  void execute();
  static void runOps(Operations ...ops) {
    for (Operations op : ops) {
      op.execute();
    }
  }
  static void show(String msg) {System.out.println(msg);}
}
