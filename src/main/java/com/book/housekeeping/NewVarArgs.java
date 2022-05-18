package com.book.housekeeping;

public class NewVarArgs {
  public static void printArray(Object... args) {
    for (Object object : args) {
      System.out.print(object + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    // can take individual elements
    printArray(47, (float) 3.14, 11.11);
    printArray(47, 3.14F, 11.11);
    printArray("one", "two", "three");
    printArray(new A(), new A(), new A());

    // or an array
    printArray((Object[])new Integer[]{ 1, 2, 3, 4 });
    printArray(); // Empty list is OK
  }
}
