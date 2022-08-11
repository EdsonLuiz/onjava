package com.book.interfaces.interfaceprocessor;

public class Applicator {
  public static void apply(Processor processor, Object s) {
    System.out.println("Using processor " + processor.name());
    System.out.println(processor.process(s));
  }
}
