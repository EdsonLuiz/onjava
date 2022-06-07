package com.book.reuse;

/**
 * One way to build a space ship is to use inheritance
 * 
 * @implNote DerivedSpaceShip ins't really "a type of" SpaceShipControls. Is more accurate to say that SpaceShipe contains  "SpaceShipControls", and at the same time all the methods in "SpaceShipControls" are exposed in a space ship.
 */ 
public class DerivedSpaceShip extends SpaceShipControls {
  private String name;

  public DerivedSpaceShip(String name) {
    this.name = name;
  }

  @Override public String toString() {
    return name;
  }

  public static void main(String[] args) {
    DerivedSpaceShip protector = new DerivedSpaceShip("NSEA Protector");
    protector.forward(100);
  }
}
