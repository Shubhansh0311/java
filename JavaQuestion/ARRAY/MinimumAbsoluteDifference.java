package ARRAY;

import java.lang.*;
import java.util.*;

public class MinimumAbsoluteDifference {

  public static void main(String[] args) {
    int arr[] = { 2, 5, 4, 3 };
    Arrays.sort(arr);
    int sum = 0;
    int n = arr.length;
    sum += Math.abs(arr[0] - arr[1]);
    sum += Math.abs(arr[n - 1] - arr[n - 2]);

    for (int i = 1; i < n - 1; i++) {
      sum +=
        Math.min(Math.abs(arr[i] - arr[i - 1]), Math.abs(arr[i] - arr[i + 1]));
    }
    System.out.println(sum);
  }
}
