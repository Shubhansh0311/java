package ARRAY;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MaxSubarrayProduct {

  public static void main(String[] args) {
    int max = Integer.MIN_VALUE;
    int arr[] = { 10, -20, -30, 0, 70, -80, -20 };
    int result = 0;
    for (int i = 0; i < arr.length; i++) {
      int mul = arr[i]; //value of starting index
      for (int j = i + 1; j < arr.length; j++) {
        result = Math.max(result, mul);
     mul *= arr[j]; //updating value at i by multiplying with the value at j  👉(i*j)
      }
      result = Math.max(result, mul); //again checking the result for the max answer
    }
    System.out.println(result);
  }
}
