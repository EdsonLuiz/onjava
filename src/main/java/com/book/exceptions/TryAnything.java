package com.book.exceptions;

class Aything {}

/*
 * Define an object within the resource specification header
 * that is not Autoclosable emits a compile-time error.
 */
public class TryAnything {
  public static void main(String[] args) {
    try (
      Aything a = new Aything();
    ) {
      
    } catch (Exception e) {
      // TODO: handle exception
    }
  }
}
