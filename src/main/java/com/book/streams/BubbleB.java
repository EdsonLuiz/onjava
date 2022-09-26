package com.book.streams;

public class BubbleB {
  public final int i;

  public BubbleB(int n) {i = n;}

  @Override
  public String toString() {
    return "BubbleB (" + i + ")";
  }

  private static int count = 0;

  public static BubbleB bubblerb() {
    return new BubbleB(count++);
  }
}
