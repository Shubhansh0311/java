package ARRAY;

import java.util.HashSet;

public class RemoveDuplicateFromTheArray {

  public static void main(String[] args) {
    int arr[] = { 10, 20, 20, 30, 40, 40, 40, 50, 50 };
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
      set.add(arr[i]);
    }
    System.out.println(set);
  }
}
