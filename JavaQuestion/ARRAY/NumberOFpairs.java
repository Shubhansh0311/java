package ARRAY;

import java.util.*;

public class NumberOFpairs {

  public static int getPairs(int arr[], int sum) {
    int result = 0;
   
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        if (arr[i] + arr[j] == sum) {
          result++;
        }
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 5, 7, -1, 5 };
    int sum = 6;
    System.out.println(getPairs(arr, sum));
  }
}
