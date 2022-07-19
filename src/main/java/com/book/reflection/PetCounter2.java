package com.book.reflection;

import com.book.reflection.pets.PetCreator;

public class PetCounter2 {
  public static void main(String[] args) {
    new PetCounter().count(new PetCreator());
  }  
}
