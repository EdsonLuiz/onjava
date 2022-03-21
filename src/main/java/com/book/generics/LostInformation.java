package com.book.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Frob {
}

class Fnorkle {
}

class Quark<Q> {
}

class Particle<POSITION, MOMENTUM> {
}

public class LostInformation {
  public static void main(String[] args) {
    List<Frob> list = new ArrayList<>();
    Map<Frob, Fnorkle> map = new HashMap<>();
    Quark<Fnorkle> quark = new Quark<>();
    Particle<Long, Double> p = new Particle<>();

    /**
     * Class.getTypeParameters() returns an array
     * of TypeVariable objects that represent the type variables declared
     * by the generic declaration
     * 
     * There`s no information about generic parameter types 
     * available inside generic code.
     */
    System.out.println(Arrays.toString(
      list.getClass().getTypeParameters()
    ));

    System.out.println(Arrays.toString(
      map.getClass().getTypeParameters()
    ));

    System.out.println(Arrays.toString(
      quark.getClass().getTypeParameters()
    ));

    System.out.println(Arrays.toString(
      p.getClass().getTypeParameters()
    ));
  }
}
