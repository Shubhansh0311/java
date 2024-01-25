package ARRAYLIST;

public class PairSum {

  // complexity =O(n)
  public static boolean CheckPair(int arr[], int target) {
    int n = arr.length;
    int lp = 0;
    int rp = n - 1;

    while (lp != rp) {
      if (arr[lp] + arr[rp] == target) {
        return true;
      }
      if (arr[lp] + arr[rp] < target) {
        lp++;
      } else {
        rp--;
      }
    }

    return false;
  }

  //   complexity =(n^2)
  public static boolean pair(int arr[], int key) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] == key) {
          return true;
        }
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6 };

    // O(n)
    System.out.println(pair(arr, 7));

    // O(n^2)
    System.out.println(CheckPair(arr, 7));
  }
}
