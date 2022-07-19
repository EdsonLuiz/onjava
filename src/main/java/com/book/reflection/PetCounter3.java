package com.book.reflection;

import java.util.HashMap;

import java.util.*;
import java.util.stream.*;

import com.book.reflection.pets.Pet;
import com.book.reflection.pets.PetCreator;
import com.book.common.Pair;

public class PetCounter3 {
  static class Counter extends HashMap<Class<? extends Pet>, Integer> {
    Counter() {
      super(
        PetCreator.ALL_TYPES.stream()
        .map(type -> Pair.make(type, 0))
        .collect(Collectors.toMap(Pair::key, Pair::value))
      );
    }

    public void count(Pet pet) {
      // Class.isInstance() eliminates instaceof:
      entrySet().stream()
        .filter(pair -> pair.getKey().isInstance(pet))
        .forEach(pair -> 
          put(pair.getKey(), pair.getValue() + 1)
        );
    }

    @Override
    public String toString() {
      String result = entrySet().stream()
      .map(pair -> String.format("%s=%s", pair.getKey().getSimpleName(), pair.getValue()))
      .collect(Collectors.joining(", "));

      return "{"+ result + "}";
    }
  }

  public static void main(String[] args) {
    Counter petCount = new Counter();
    new PetCreator().strean()
      .limit(20)
      .peek(petCount::count)
      .forEach(p -> System.out.println(
        p.getClass().getSimpleName() + " "
      ));

      System.out.println("\n" + petCount);
  }
}
