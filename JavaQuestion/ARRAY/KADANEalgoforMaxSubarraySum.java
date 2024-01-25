package ARRAY;

import java.util.*;

public class KADANEalgoforMaxSubarraySum {

  public static void main(String[] args) {
    int arr[] = { -1, -2, -6, -11, -4 };
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 0) {
        max = Math.max(max, arr[i]);
      }
    }

    int currsum = 0;
    int maxsum = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      currsum = currsum + arr[i];
      if (currsum < 0) {
        currsum = 0;
      }
      maxsum = Math.max(maxsum, currsum);
    }
    if (maxsum == 0) {
      System.out.println(max);
    } else {
      System.out.println(maxsum);
    }
  }
}
