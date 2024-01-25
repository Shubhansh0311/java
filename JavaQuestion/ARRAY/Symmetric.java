package ARRAY;

import java.util.HashMap;
import java.util.Scanner;

public class Symmetric {

  public static void main(String[] args) {
    int arr[][] = new int[5][2];
    arr[0][0] = 1;
    arr[0][1] = 2;
    arr[1][0] = 3;
    arr[1][1] = 4;
    arr[2][0] = 5;
    arr[2][1] = 1;
    arr[3][0] = 4;
    arr[3][1] = 3;
    arr[4][0] = 1;
    arr[4][1] = 50;

    // for (int i = 0; i <5; i++) {
    //   for (int j = 0; j < 2; j++) {
    //     if(arr[i][0]==arr[j][1]&&arr[i][1]==arr[j][0]){
    //       System.out.println(arr[i][0]+" "+arr[i][1]);
    //     }
    //   }

    // }

    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < 5; i++) {
      int first = arr[i][0];
      int sec = arr[i][1];
      // checking for the second part of the arary
      Integer val = map.get(sec);
      if (val != null && val == first) {
        System.out.println(sec + " " + first);
      } else map.put(first, sec);
    }
  }
}
