package ARRAY;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

public class MinimumScalarProduct {

  public static void main(String[] args) {
   Integer arr1[] = { 10, 30, 40, 20 };
 Integer arr2[] = {2,4,5,1 };
    Arrays.sort(arr1);

    Arrays.sort(arr2);

    int result=0;

    for (int j = 0; j < arr2.length; j++) {
    result+=(arr1[j]*arr2[j]);
    }
    System.out.println(result);
  }
}
