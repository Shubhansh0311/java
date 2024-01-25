package BINARYTREES;

import javax.naming.BinaryRefAddr;

public class BinarySearch {

  public static int Binary(int arr[], int l, int h, int n) {
    while (l <= h) {
      int mid = (l + h) / 2;

      if (arr[mid] == n) {
        return mid;
      }
      if (arr[mid] > n) {
        return Binary(arr, l, mid - 1, n);
      } else {
        return Binary(arr, mid + 1, h, n);
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 65, 7 };

    int l = arr[0];
    int h = arr.length - 1;

    System.out.println(Binary(arr, l, h, 659));
  }
}
