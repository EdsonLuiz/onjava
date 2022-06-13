package com.book.reuse;

class Villain {
  private String name;
  protected void set(String nm) {
    this.name = name;
  }

  Villain(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "I'm a villain and my name is " + name;
  }
}

/*
 * The protected keyword
 */
class Orc extends Villain {
  private int orgNUmber;

  public Orc(String name, int orcNumber) {
    super(name);
    this.orgNUmber = orcNumber;
  }

  public void change(String name, int orcNumber) {
    set(name);  // Availabel because it's protected
    this.orgNUmber = orcNumber;
  }

  @Override
  public String toString() {
    return "Orc " + orgNUmber + ": " + super.toString();
  }

  public static void main(String[] args) {
    Orc orc = new Orc("Limburger", 12);
    System.out.println(orc);
    orc.change("Bob", 19);
    System.out.println(orc);
  }
}
