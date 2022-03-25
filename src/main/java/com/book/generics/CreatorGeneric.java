package com.book.generics;

abstract class GenericWithCrete<T> {
  final T element;
  GenericWithCrete() {element = create();}
  abstract T create();
}

class X {}

class XCreator extends GenericWithCrete<X> {
  @Override
  X create() {
    return new X();
  }

  void f() {
    System.out.println(
      element.getClass().getSimpleName()
    );
  }
}

public class CreatorGeneric {
  public static void main(String[] args) {
    XCreator xc = new XCreator();
    xc.f();
  }
}
