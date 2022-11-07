package com.book.exceptions;

class CE extends Exception {}


class SecondExcept extends Reporter {
  SecondExcept() throws CE {
    super();
    throw new CE();
  }
}

/*
 * Constructor within the resource spectification header
 * throws exception.
 * The midle object constructor throws exception.
 * The compiler forces us to catch the constructor exception.
 * 
 * The first object is created.
 * The second throws an error.
 * The first object is closed.
 * The second object is closed.
 * The last object was not created and no need to close this.
 */
public class ConstructorException {
  public static void main(String[] args) {
    try (
      Fisrt f = new Fisrt();
      SecondExcept s = new SecondExcept();
      Second s2 = new Second();
    ) {
      System.out.println("In body");
    } catch (CE e) {
      System.out.println("Caught: " + e);
    } catch (Exception e) {
      System.out.println("Caught: " + e);
    }
  }
}
