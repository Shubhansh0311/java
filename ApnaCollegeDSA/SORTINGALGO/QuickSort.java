package SORTINGALGO;

public class QuickSort {

  public static int partition(int arr[], int si, int ei) {
    int pivot = arr[ei];
    int i = si - 1;
    for (int j = si; j < ei; j++) {
        // comparing pivot 
      if (arr[j] <= pivot) {
        i++;
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
      }
    }
    i++;
    int temp = pivot;
    arr[ei] = arr[i];
    arr[i] = temp;
    // returning the index of the pivot
    return i;
  }

  public static void quicksort(int arr[], int si, int ei) {
    if (si >= ei) {
      return;
    }
    int pvt = partition(arr, si, ei);
    quicksort(arr, si, pvt - 1);
    quicksort(arr, pvt + 1, ei);
  }

  public static void main(String[] args) {
    int arr[] = { 1,5,8,2,6,9,4,3,0,7};
    quicksort(arr, 0, arr.length - 1);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
