package com.book.reflection;

import java.util.Optional;

public class Person {
  private static final String LAST = "Ribeiro";
  public final Optional<String> first;
  public final Optional<String> last;
  public final Optional<String> address;
  public final boolean empty;

  Person(String first, String last, String address) {
    this.first = Optional.ofNullable(first);
    this.last = Optional.ofNullable(last);
    this.address = Optional.ofNullable(address);
    empty = !this.first.isPresent()
      && !this.last.isPresent()
      && !this.address.isPresent();
  }

  Person(String first, String last) {
    this(first, last, null);
  }

  Person(String last) {
    this(null, last, null);
  }

  Person() {
    this(null, null, null);
  }

  @Override
  public String toString() {
    if(empty)
      return "<Empty>";

    return (first.orElse("") +
      " " + last.orElse("") +
      " " + address.orElse("")).trim();
  }

  public static void main(String[] args) {
    System.out.println(new Person());
    System.out.println();
    System.out.println(new Person(LAST));
    System.out.println();
    System.out.println(new Person("Edson", LAST));
    System.out.println();
    System.out.println(new Person("Edson", LAST, "Some Street 101"));
    System.out.println();
  }
}
