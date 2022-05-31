package com.book.hiding;

public class CreatePackageAccessObject {
  public static void main(String[] args) {
    /**
     * Don't compile, the constructor is inside a class with package-access
     */
    // new PublicConstructor();
  }
}
