package BACKTRACKING;

import LINKEDLIST.isPallindrome;

public class BacktrackingOnAnArray {

  // find permutation function
  public static void findPermutation(String str, String ans) {
    // base
    if (str.length() == 0) {
      System.out.println(ans);
      return;
    }
    // recursion
    for (int i = 0; i < str.length(); i++) {
      char curr = str.charAt(i);
      // remove the current char
      String newstr = str.substring(0, i) + str.substring(i + 1); //if last index provided then the last n-1 length is taken as parameter
      // call the fun
      findPermutation(newstr, ans + curr);
    }
  }

  // subset function
  public static void subset(String str, int i, String substr) {
    if (i == str.length()) {
      System.out.print(substr + " ");
      return;
    }
    subset(str, i + 1, str.charAt(i) + substr);
    subset(str, i + 1, substr);

  }

  // Assign value function
  public static void assignValue(int arr[], int i, int value) {
    if (i == arr.length) {
      return;
    }

    arr[i] = value;
    assignValue(arr, i + 1, value + 1);
    arr[i] = arr[i] - 2;
  }

  public static void main(String[] args) {
    int arr[] = new int[5];
    assignValue(arr, 0, 1);
    // for (int i = 0; i < arr.length; i++) {
    //   System.out.print(arr[i] + " ");
    // }
    String str = "ABC";
    String substr = "";
    subset(str, 0, substr);

    findPermutation(str, substr);
  }
}
