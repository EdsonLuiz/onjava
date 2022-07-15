package com.book.reflection.pets;

import java.util.ArrayList;
import java.util.List;

public class ForNamePetCreator extends Creator{
  private static List<Class <? extends Pet>> types = new ArrayList<>();

  // Types you want randomly created
  private static String[] typeNames = {
    "com.book.reflection.pets.Mutt",
    "com.book.reflection.pets.Pug",
    "com.book.reflection.pets.EgyptianMau",
    "com.book.reflection.pets.Manx",
    "com.book.reflection.pets.Cymric",
    "com.book.reflection.pets.Rat",
    "com.book.reflection.pets.Mouse",
    "com.book.reflection.pets.Hamster"
  };

  @SuppressWarnings("unchecked")
  private static void loader() {
    try {
      for(String name : typeNames)
        types.add(
          (Class<? extends Pet>)Class.forName(name)
        );
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public List<Class<? extends Pet>> types() {
    return types;
  }
  
}
