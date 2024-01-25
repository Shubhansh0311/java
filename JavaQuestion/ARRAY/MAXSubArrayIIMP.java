package ARRAY;

public class MAXSubArrayIIMP {

  // more optimize O(n^2)

  public static int MaxSum(int arr[]) {
    int maxsum = Integer.MIN_VALUE;
    int currsum = 0;
    int prefixArr[] = new int[arr.length];
    prefixArr[0] = arr[0];
    for (int i = 1; i < prefixArr.length; i++) {
      prefixArr[i] = prefixArr[i - 1] + arr[i];
    }
    for (int i = 0; i < arr.length; i++) {
      int start = i;
      for (int j = i; j < arr.length; j++) {
        int end = j;
        currsum =
          i == 0 ? prefixArr[end] : prefixArr[end] - prefixArr[start - 1];
      }
      maxsum = Math.max(maxsum, currsum);
    }
    return maxsum;
  }

  public static void main(String[] args) {
    int arr[] = { 1, -2, 6, -1, 3 };
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    int count = 0;
    int sum = 0;

    // O(n^3)
    for (int i = 0; i < arr.length; i++) {
      int start = i;
      for (int j = i; j < arr.length; j++) {
        int end = j;
        for (int k = start; k <= end; k++) {
          sum += arr[k];
          System.out.print(arr[k] + " ");
        }
        System.out.print("sum : " + sum);
        min = Math.min(min, sum);
        max = Math.max(max, sum);
        sum = 0;
        count++;
        System.out.println();
      }
      System.out.println();
    }
    System.out.println("count :  " + count);
    System.out.println("max sum : " + max);
    System.out.println("min sum : " + min);

    // O(n^2)
    System.out.println("optimize");
    System.out.println(MaxSum(arr));
  }
}
