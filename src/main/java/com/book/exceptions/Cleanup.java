package com.book.exceptions;

public class Cleanup {
  public static void main(String[] args) {
    try {
      InputFile in = new InputFile("/home/edrodrigues/LEARNING/JAVA/onjava/src/main/java/com/book/exceptions/Cleanup.java");

      try {
        String s;
        int i = 1;
        while((s = in.getLine()) != null)
          ; // Perform line-by-line processing here
      } catch (Exception e) {
        System.out.println("Caught Exception in main");
        e.printStackTrace(System.out);
      } finally {
        in.dispose();
      }

    } catch (Exception e) {
      System.out.println("InputFile construction failed");
    }
  }
}
