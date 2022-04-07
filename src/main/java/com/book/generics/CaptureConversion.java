package com.book.generics;

public class CaptureConversion {
  static <T> void f1(Holder<T> holder) {
    T t = holder.get();
    System.out.println(t.getClass().getSimpleName());
  }

  static void f2(Holder<?> holder) {
    f1(holder); // Call with capture type
  }

  @SuppressWarnings("unchecked")
  public static void main(String[] args) {
    Holder raw = new Holder<>(1);

    f1(raw);
    
  }
}
