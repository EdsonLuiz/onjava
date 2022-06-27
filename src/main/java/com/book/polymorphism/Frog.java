package com.book.polymorphism;

class Characteristic {
  private String s;
  Characteristic(String s) {
    this.s = s;
    System.out.println("Creating characteristic " + s);
  }

  protected void dispose() {
    System.out.println("disposing Characteristic " + s);
  }
}

class Description {
  private String s;
  Description(String s) {
    this.s = s;
    System.out.println("Creating description " + s);
  }
  
  protected void dispose() {
    System.out.println("disposing Description " + s);
  }
}

class LivingCreature {
  private Characteristic p = new Characteristic("is alive");
  private Description t = new Description("Basic living creature");
  LivingCreature() {
    System.out.println("LivingCreature()");
  }

  protected void dispose() {
    System.out.println("LivingCreatureDispose");
    t.dispose();
    p.dispose();
  }
}

class Animal extends LivingCreature {
  private Characteristic p = new Characteristic("has heart");
  private Description t = new Description("Animal no vegetable");
  Animal() {
    System.out.println("Animal()");
  }

  @Override
  protected void dispose() {
    System.out.println("Animal dispose");
    t.dispose();
    p.dispose();
    super.dispose();
  }
}

class Anphibian extends Animal {
  private Characteristic p = new Characteristic("can live in water");
  private Description t = new Description("Both water and land");
  Anphibian() {
    System.out.println("Anphibian()");
  }

  @Override
  protected void dispose() {
    System.out.println("Anphibian dispose");
    t.dispose();
    p.dispose();
    super.dispose();
  }
}

/*
 * Cleanup and inheritance
 */
public class Frog extends Anphibian {
  private Characteristic p = new Characteristic("chroaks");
  private Description t = new Description("Eats bugs");
  public Frog() {
    System.out.println("Frog()");
  }

  @Override
  protected void dispose() {
    System.out.println("Frog dispose");
    t.dispose();
    p.dispose();
    super.dispose();
  }

  public static void main(String[] args) {
    Frog frog = new Frog();
    System.out.println("Bye!!");
    frog.dispose();
  }
}
