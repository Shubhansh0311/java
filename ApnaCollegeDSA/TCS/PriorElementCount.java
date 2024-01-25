package TCS;

// Given an integer array Arr of size N the task is to find the count of elements whose value is greater than all of its prior elements.
public class PriorElementCount {

  public static void main(String[] args) {
    int arr[] = { 7, 4, 6, 3, 2, 5 };
    int count = 0;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length - 1; i++) {
      int curr = arr[i];
      if (arr[i] > arr[i + 1]) {
        count++;
      }
    }

    System.out.println(
      "count of number whichare great then their prior element equals to  " +
      (arr.length - count)
    );
  }
}
