package ARRAY;

public class MaxSubarraySum {

  public static int maxSum(int arr[]) {
    int maxsum = Integer.MIN_VALUE;
    int currsum = 0;
    for (int i = 0; i < arr.length; i++) {
      currsum += arr[i];
      if (currsum < 0) {
        currsum = 0;
      }
      maxsum = Math.max(currsum, maxsum);
    }
    return maxsum;
  }

  public static void main(String[] args) {
    int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
    System.out.println(maxSum(arr));
  }
}
