package com.book.reflection;

import com.book.common.TypeCounter;
import com.book.reflection.pets.Pet;
import com.book.reflection.pets.PetCreator;

public class PetCounter4 {
  public static void main(String[] args) {
    TypeCounter counter = new TypeCounter(Pet.class);
    new PetCreator().strean()
      .limit(20)
      .peek(counter::count)
      .forEach(p ->
        System.out.println(p.getClass().getSimpleName() + " ")
      );
      System.out.println("\n" + counter);
  }
}
