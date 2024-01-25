package ARRAY;

import java.util.HashSet;
import java.util.Set;

public class DistinctElementArray {

  public static void main(String[] args) {
    int arr1[] = { 10, 51, 3, 43, 6 };
    int arr2[] = { 80, 71, 29,51 };
    boolean ans = true;
    Set<Integer> set = new HashSet();
    for (int i = 0; i < arr1.length; i++) {
      set.add(arr1[i]);
    }
    for (int i = 0; i < arr2.length; i++) {
      if (set.contains(arr2[i])) {
        ans = false;
      }
    }
    System.out.println(ans);
  }
}
