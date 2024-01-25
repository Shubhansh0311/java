package ARRAY;

import java.util.*;

public class CommonEle {

  public static void commonEle(int arr1[], int arr2[], int arr3[]) {
    int i = 0, j = 0, k = 0;
    while (i < arr1.length && j < arr2.length && k < arr3.length) {
      if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
        System.out.print(arr1[i] + " ");
        i++;
        j++;
        k++;
      } else if (arr1[i] < arr2[j]) {
        i++;
      } else if (arr2[j] < arr3[k]) {
        j++;
      } else {
        k++;
      }
    }
  }

  public static void main(String[] args) {
    int arr1[] = { 1, 5, 5 };
    int arr2[] = { 3, 4, 5, 5, 10 };
    int arr3[] = { 5, 5, 10, 20 };
    commonEle(arr1, arr2, arr3);
  }
}
