package ARRAY;

public class Equilibriumindex_2 {

  public static int findEqui(int arr[]) {
    int left = 0;
    int right = arr.length - 1;
    int mid = left + (right - left) / 2;
    int leftsum = 0, rightsum = 0;

    for (int i = 0; i < mid; i++) {
      leftsum += arr[i];
    }
    for (int i = mid + 1; i < arr.length; i++) {
      rightsum += arr[i];
    }
    if (rightsum > leftsum) {
      while (rightsum >leftsum && mid < right) {
        leftsum += arr[mid];
        rightsum -= arr[mid+1];
      }
    }
   else  {
      while (rightsum < leftsum && mid > left) {
        leftsum -= arr[mid-1];
        rightsum += arr[mid];
      }
    }
if(leftsum==rightsum){
    return mid;
}
    return -1;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 4, 3, 5, 4, 2, 1, 3 };
    System.out.println(findEqui(arr));
  }
}
