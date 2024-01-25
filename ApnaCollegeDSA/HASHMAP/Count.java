package HASHMAP;

import java.util.HashMap;
import java.util.Set;

public class Count {

  public static int returnCount(long n) {
    int count = 0;
    if (n == 0 || (n > 0 && n < 10)) {
      return 1;
    }
    int num = (int) n;
    while (num != 0) {
      num = num / 10;
      count++;
    }
    return --count;
  }

  //find the least liked number from the n number of student
  public static void main(String[] args) {
    long n = 10;

    int arr[] = { 1, 1, 1, 3, 4, 5, 5, 2, 2 };
    int count = 0;
    int least = -1;
    int mincount = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {

      for (int j = 0; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          count++;
        }
        if (mincount > count) {
          count = mincount;
          least = arr[i];
        }
      }
    }
System.out.println(returnCount(1));
    System.out.println(least);
  }
}
