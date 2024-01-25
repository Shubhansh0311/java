package RECURSION;

public class CheckArrayIsSorted {

  public static boolean isSorted(int arr[], int i) {
    if (i == arr.length - 1) {
      return true;
    }
    if (arr[i] > arr[i + 1]) {
      return false;
    }
    return isSorted(arr, i + 1);
  }

  public static void main(String[] args) {
    int arr[] = { 1, 5, 7, 13, 15 };
    System.out.println("is the array sorted " + isSorted(arr, 0));
  }
}
