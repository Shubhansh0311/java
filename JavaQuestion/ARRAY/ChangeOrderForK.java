package ARRAY;

import java.util.*;

public class ChangeOrderForK {

  public static int[] RotateK(int arr[], int k) {
    int temp[] = new int[arr.length];
    for (int i = 0; i < k; i++) {
      temp[i] = arr[i];
    }
    int i = 0;
    for (int m = k - 1; m >= 0; m--) {
      arr[m] = temp[i];
      i++;
    }
    return arr;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int k = 3;
    int RotateArr[] = RotateK(arr, k);
    System.out.print(Arrays.toString(RotateArr));
  }
}
