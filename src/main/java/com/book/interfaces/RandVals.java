package com.book.interfaces;

import java.util.Random;

public interface RandVals {
  Random RAND = new Random(47);
  int RANDOM_INT = RAND.nextInt(10);
  long RANOM_LONG = RAND.nextLong() * 10;
  float RANDOM_FLOAT = RAND.nextFloat() * 10;
  double RANDOM_DOUBLE = RAND.nextDouble() * 10;
}
