package ARRAY;

import java.util.*;

public class RepeatingElement {

  public static void main(String[] args) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int arr[] = { 0, 4, 3, 2, 7, 8, 2, 3, 1 };
    for (int i = 0; i < arr.length; i++) {
      int a = arr[i];
      map.put(a, map.getOrDefault(a, 0) + 1);
    }
    for (Integer key : map.keySet()) {
      if (map.get(key) > 1) System.out.println(key);
    }
  }
}
