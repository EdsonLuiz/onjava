package com.book.strings;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.book.generics.coffee.Coffee;
import com.book.generics.coffee.CoffeeSupplier;

public class ArrayListDisplay {
  public static void main(String[] args) {
    List<Coffee> coffees = Stream.generate(new CoffeeSupplier())
      .limit(10)
      .collect(Collectors.toList());

    System.out.println(coffees);
  }
}
