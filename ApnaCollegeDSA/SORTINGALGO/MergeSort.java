package SORTINGALGO;

public class MergeSort {
// time complexity= O(nlogn)
// space complexity= O(n)
  public static void merging(int arr[], int si, int mid, int ei) {
    int temp[] = new int[(ei - si )+ 1];
    int i = si; //for the first part of the array or the left part
    int j = mid + 1; //for the second part of the array or the right part
    int k = 0; //for temporary array


// copying the value to the temp array 
    while (i <= mid && j <= ei) {
      if (arr[i] < arr[j]) {
        temp[k] = arr[i];
        i++;
      } else {
        temp[k] = arr[j];
        j++;
      }
      k++;
    }
    while (i <= mid) {
      temp[k++] = arr[i++];
    }
    while (j <= ei) {
      temp[k++] = arr[j++];
    }

    // copying the value to the original array 
    for (i = si, k = 0; k < temp.length; k++, i++) {
      arr[i] = temp[k];
    }
  }

  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void merge(int arr[], int si, int ei) {
    if (si >= ei) {
      return;
    }

    int mid = si + (ei - si) / 2;

    // finding the left and right part 
    merge(arr, si, mid);
    merge(arr, mid+1, ei);
// function to merge the two parts of the array 
    merging(arr, si, mid, ei);
  }

  public static void main(String[] args) {
    int arr[] = { 6, 2, 8, 9, 1, 5 };
    merge(arr, 0, arr.length-1);
    printArray(arr);
  }
}
