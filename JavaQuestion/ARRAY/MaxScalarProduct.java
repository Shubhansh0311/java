package ARRAY;

import java.util.Arrays;
import java.util.Collection;

public class MaxScalarProduct {

  public static void main(String[] args) {
    int arr1[] = { 1, 2, 6, 3, 7 };
    int arr2[] = { 10, 7, 45, 3, 7 };
    Arrays.sort(arr1);

    Arrays.sort(arr2);

    int result = 0;

    for (int j = 0; j < arr2.length; j++) {
      result += (arr1[j] * arr2[j]);
    }
    System.out.println(result);
  }
}
