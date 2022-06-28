package com.book.polymorphism;

class Shared {
  private int refCount = 0;
  private static long counter = 0;
  private final long id = counter++;

  Shared() {
    System.out.println("Creating " + this);
  }

  public void addRef() {
    refCount++;
  }

  protected void dispose() {
    if(--refCount == 0) {
      System.out.println("Disposing " + this);
    }
  }

  @Override
  public String toString() {
    return "Shared " + id;
  }
}

class Composing {
  private Shared shared;
  private static long counter = 0;
  private final long id = counter++;

  Composing(Shared shared) {
    System.out.println("Creating " + this);
    this.shared = shared;
    this.shared.addRef();
  }

  protected void dispose() {
    System.out.println("Dispose " + this);
    shared.dispose();
  }

  @Override
  public String toString() {
    return "Composing " + id;
  }

}

/*
 * Clean up shared member objects
 */
public class ReferenceCounting {
  public static void main(String[] args) {
    Shared shared = new Shared();
    Composing[] composing = {
      new Composing(shared),
      new Composing(shared),
      new Composing(shared),
      new Composing(shared),
      new Composing(shared)
    };
    for (Composing c : composing) {
      c.dispose();
    }
  }
}
