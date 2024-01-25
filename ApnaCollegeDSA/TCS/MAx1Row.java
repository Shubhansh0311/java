package TCS;

import java.util.*;

public class MAx1Row {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of row ");
    int row = sc.nextInt();
    System.out.println("enter the number of col ");
    int col = sc.nextInt();
    int arr[][] = new int[row][col];

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    int max = 0;
    int index = 0;
    for (int i = 0; i < arr.length; i++) {
      int count = 0;

      for (int j = 0; j < arr.length; j++) {
        if (arr[i][j] == 1) {
          count++;
        }
        if (count > max) {
          max = count;
          index = i + 1;
        }
      }
    }
    System.out.println("the row number is " + index);
  }
}
