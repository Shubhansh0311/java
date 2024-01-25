package SORTINGALGO;

public class SelectionSort {

  public static void main(String[] args) {
    int arr[] = { 2, 4, 6, 8, 0, 1, 3, 5, 7, 9 };
    for (int i = 0; i < arr.length - 1; i++) {
      int min = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[min] > arr[j]) {
            // finding the minimum position 
          min = j;
        }
      }
      int temp = arr[min];
      arr[min] = arr[i];
      arr[i] = temp;
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
