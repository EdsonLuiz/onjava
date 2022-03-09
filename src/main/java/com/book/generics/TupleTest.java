package com.book.generics;

public class TupleTest {
  static Tuple2<String, Integer> f() {
    return new Tuple2<String,Integer>("Hi", 47);
  }

  static Tuple3<Amphibian, String, Integer> g() {
    return 
      new Tuple3<Amphibian,String,Integer>(
        new Amphibian(), "Hi", 47);
  }

  static Tuple4<Vehicle, Amphibian, String, Integer> h() {
    return 
      new Tuple4<Vehicle,Amphibian,String,Integer>(
        new Vehicle(), new Amphibian(), "Hi", 47);
  }

  static Tuple5<Vehicle, Amphibian, String, Integer, Double> k() {
    return
      new Tuple5<Vehicle,Amphibian,String,Integer,Double>(
        new Vehicle(), new Amphibian(), "Hi", 47, 11.1);
  }

  public static void main(String[] args) {
    Tuple2<String, Integer> ttsi = f();
    System.out.println(ttsi);

    System.out.println(g());
    System.out.println(h());
    System.out.println(k());
  }
}
