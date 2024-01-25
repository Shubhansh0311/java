package ARRAY;

import java.util.*;

public class RotateArraybyKtimes {

  //   public static void Rotate(int arr[], int k) {
  //     ArrayDeque<Integer> queue = new ArrayDeque<>();
  //     for (int i = k; i < arr.length; i++) {
  //       queue.addLast(arr[i]);
  //     }
  //     for (int i = 0; i < k; i++) {
  //       queue.addLast(arr[i]);
  //     }
  //     for (int i = 0; i < arr.length; i++) {
  //       arr[i] = queue.remove();
  //     }
  //   }

  //   using single rotation

  public static void rotateOneByOne(int arr[], int n) {
    int temp = arr[0];
    for (int i = 0; i < n - 1; i++) {
      arr[i] = arr[i + 1];
    }
    arr[n - 1] = temp;
  }

  public static void rotate(int arr[], int k, int n) {
    for (int i = 0; i < k; i++) {
      rotateOneByOne(arr, n);
    }
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4 };
    int k = 2;
    // Rotate(arr, k);
    rotate(arr, k, arr.length);
    System.out.print(Arrays.toString(arr));
  
  }
}
