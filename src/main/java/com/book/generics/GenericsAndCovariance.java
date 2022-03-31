package com.book.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsAndCovariance {
  public static void main(String[] args) {
    // Wildcards allow covariance
    // Read "a List of any type that`s inherited from Fruit"
    List<? extends Fruit> fList = new ArrayList<>();
    // Compile Error: can't add any type of object:
    // flist.add(new Apple());
    // flist.add(new Fruit());
    // flist.add(new Object());
    fList.add(null);        // Legal but uninteresting

    // we know it returns at least Fruit
    Fruit f = fList.get(0);
  }
}
