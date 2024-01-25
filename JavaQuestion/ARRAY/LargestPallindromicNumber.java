package ARRAY;

import java.sql.Array;
import java.util.Arrays;

// sorting
// reverse
// check for pallindrome

public class LargestPallindromicNumber {

  public static boolean isPallindrome(int num) {
    int n = num;
    int reverse = 0;
    while (n != 0) {
      int a = n % 10;
      reverse = reverse * 10 + a;
      n /= 10;
    }
    if (reverse == num) {
      return true;
    }

    return false;
  }

  public static int largestNumber(int arr[]) {
    for (int i = arr.length - 1; i >= 0; i--) {
      if (isPallindrome(arr[i])) {
        return arr[i];
      }
    }

    return 0;
  }

  public static void main(String[] args) {
    int arr[] = { 21212, 21312, 123433, 5115, 123423, 32343 };
    Arrays.sort(arr);

    int largest = largestNumber(arr);
    System.out.println("largest pallindromic number is : " + largest);
  }
}
