package ARRAY.ElementMoreThanN;

import java.util.*;

public class ktimes {

  public static void main(String[] args) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int arr[] = { 1, 1, 2, 2, 3, 5, 4, 2, 2, 3, 1, 1, 1 };
    int k = 4;
    for (int i = 0; i < arr.length; i++) {
      int a = arr[i];
      map.put(a, map.getOrDefault(a, 0) + 1);
    }
    for (Integer key : map.keySet()) {
      if (map.get(key) > arr.length / k) {
        System.out.println(key);
      }
    }
  }
}
