package RECURSION;

public class MAXandMINelementoftheArray {

  public static int MinElement(int arr[]) {
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    return min;
  }
  public static int MaxElement(int arr[]) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 4, 1, 5, 6, 78, 3 };
    System.out.println("max element of the array is : " + MaxElement(arr));
    System.out.println("min element of the array is : " + MinElement(arr));
  }
}
