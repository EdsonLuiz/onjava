package com.book.housekeeping;

/**
 * Use finalize() to detect an object that
 * hasent been properly cleaned up
 */
public class TerminationCondition {
  public static void main(String[] args) {
    Book novel = new Book(true);
    //  proper cleanup
    novel.checkIn();
    //  drop the reference, forget the cleanup
    new Book(true);
    //  Force garbage collection and finalization
    System.gc();
    try {
      Thread.sleep(1000); //  One second delay
    } catch (InterruptedException e) {
      e.printStackTrace();
    } 
  }
}

class Book {
  boolean checkedOut = false;

  Book(boolean checkOut) {
    this.checkedOut = checkOut;
  }

  void checkIn() {
    this.checkedOut = false;
  }

  @Override public void finalize() {
    if(checkedOut)
      System.out.println("Error: checkedOut");
  }
}
