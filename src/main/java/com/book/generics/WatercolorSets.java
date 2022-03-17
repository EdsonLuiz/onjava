package com.book.generics;

import java.util.EnumSet;
import java.util.Set;

import com.book.generics.watercolors.Watercolors;
import static com.book.generics.watercolors.Watercolors.*;
import static com.book.generics.Sets.*;

public class WatercolorSets {
  public static void main(String[] args) {
     Set<Watercolors> set1 = EnumSet.range(BRILLIANT_RED, VIRIDIAN_HUE);
     Set<Watercolors> set2 = EnumSet.range(CERULEAN_BLUE_HUE, BURNT_UMBER);

     System.out.println("set1: " + set1);
     System.out.println();
     System.out.println("set2: " + set2);
     System.out.println();

     System.out.println(
       "union set1 set2:" + union(set1, set2)
     );

     System.out.println();

     Set<Watercolors> subset = intersection(set1, set2);
     System.out.println(
       "intersection(set1, set2): " + subset
     );

     System.out.println();

     System.out.println(
       "difference(set1, subset): " + difference(set1, subset)
     );

     System.out.println();

     System.out.println(
       "difference(set2, subset): " + difference(set2, subset)
     );

     System.out.println();

     System.out.println(
       "complement(set1, set2): " + complement(set1, set2)
     );
  }
}
