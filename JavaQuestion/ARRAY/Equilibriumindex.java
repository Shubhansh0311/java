package ARRAY;

public class Equilibriumindex {

  public static void main(String[] args) {
    boolean flag = true;
    int arr[] = { 1, 2, 3, 4, 3, 7,9, 3, 2, 3, 4, 1 };

    for (int i = 0; i < arr.length; i++) {
      int leftsum = 0;
      for (int j = 0; j < i; j++) {
        leftsum += arr[i]; //to calculate the sum of the left part
      }
      int rightsum = 0;
      for (int j = i + 1; j < arr.length; j++) {
        rightsum += arr[i]; //to calculate the sum of the right part
      }
      if (leftsum == rightsum) { //to find the mid value
        int n = i ;
        System.out.println(n);
        flag = false;
      }
    }
    if (flag) {
      System.out.println(-1);
    }
  }
}
