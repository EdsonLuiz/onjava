package com.book.streams;

public class NumericStreamInfo {
  public static void main(String[] args) throws Exception{
    System.out.println(RandInts.rands().average().getAsDouble());
    System.out.println(RandInts.rands().max().getAsInt());
    System.out.println(RandInts.rands().min().getAsInt());
    System.out.println(RandInts.rands().sum());
    System.out.println(RandInts.rands().summaryStatistics());
  }
}
