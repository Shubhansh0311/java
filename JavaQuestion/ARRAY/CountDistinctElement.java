package ARRAY;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class CountDistinctElement {

  public static int countDistinct(int arr[]) {
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
      set.add(arr[i]);
    }
    return set.size();
  }

  public static void main(String[] args) {
    int arr[] = { 1,2,3,4,5,6,7,8,9 };
 
    int ans = countDistinct(arr);
    System.err.println("distinct element within the array are " + ans);
    int n = arr.length - 1;
    for (int i = 0; i < n; i++, n--) {
      int temp = arr[i];
      arr[i] = arr[n];
      arr[n] = temp;
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
