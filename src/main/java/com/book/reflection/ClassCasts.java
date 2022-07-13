package com.book.reflection;

class Building {
  @Override
  public String toString() {
    return this.getClass().getSimpleName();
  }
}

class House extends Building {
  @Override
  public String toString() {
    return this.getClass().getSimpleName();
  }
}

public class ClassCasts {
  public static void main(String[] args) {
    Building b = new House();
    Building bg = new Building();
    Class<House> houseType = House.class;
    Class<Building> buildingType = Building.class;
    House h = houseType.cast(b);
    h = (House) b;  // or simplify with this way
    Building bd = (Building) bg;
    System.out.println(h);
    System.out.println(bd);
  }
}
