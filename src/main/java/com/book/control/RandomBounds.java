package com.book.control;

import com.book.common.TimedAbort;

public class RandomBounds {
  public static void main(String[] args) {
    new TimedAbort(3);

    switch (args.length == 0 ? "" : args[0]) {
      case "lower":
        while(Math.random() != 0.0);
        System.out.println("Produced 0.0");
        break;
      case "upper":
        while(Math.random() != 1.0);
        System.out.println("Produced 1.0");
        break;
    
      default:
        System.out.println("Usage: ");
        System.out.println("\tRandomBounds lower");
        System.out.println("\tRandomBounds upper");
        System.exit(0);
        break;

        /**
         * The square bracket means “includes,”
         * whereas the parenthesis means “doesn’t include.”
         */

        /**
         * 0.0 está incluído na saída de Math.random() , enquanto 1.0 não está. Na linguagem
         * matemática, é [0,1).
         */
    }
  }
}
