package com.book.generics;

import java.util.HashSet;
import java.util.Set;

public class Sets {
public static <T> Set<T> union(final Set<T> a, final Set<T> b) {
    Set<T> result = new HashSet<>(a);
    result.addAll(b);
    return result;
  }

  public static <T> Set<T> intersection(final Set<T> a, final Set<T> b) {
    Set<T> result = new HashSet<>(a);
    result.retainAll(b);
    return result;
  }

  // Subtract subset from a superset
  public static <T> Set<T> difference(final Set<T> superset, final Set<T> subset) {
    Set<T> result = new HashSet<>(superset);
    result.removeAll(subset);
    return result;
  }

  public static <T> Set<T> complement(final Set<T> a, final Set<T> b) {
    return difference(union(a, b), intersection(a, b));
  }
}
