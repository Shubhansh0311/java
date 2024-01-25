package GREEDY;

import java.util.*;

// complexity O(nlogn)
public class MinAbsDiff {

  public static void main(String[] args) {
    int A[] = { 5, 3, 2 };
    int B[] = { 3, 4, 1 };

    int minDiff = 0;
    Arrays.sort(A);
    Arrays.sort(B);
    for (int i = 0; i < A.length; i++) {
      minDiff += Math.abs(A[i] - B[i]);
    }

    System.out.println("min abs difference equals to " + minDiff);
  }
}
