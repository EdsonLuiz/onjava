package com.book.interfaces;

public class AnImplementation implements AnInterface{

  @Override
  public void firstMethod() {
    System.out.println("firstMethod");
  }

  @Override
  public void secondMethod() {
    System.out.println("secondMethod");
  }

  public static void main(String[] args) {
    AnInterface i = new AnImplementation();
    i.firstMethod();
    i.secondMethod();
  }
  
}
