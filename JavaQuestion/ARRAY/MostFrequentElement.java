package ARRAY;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostFrequentElement {

  public static void main(String[] args) {
    int arr[] = { 10, 30, 30, 20, 10, 20, 50, 10 };
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    }
    for (Integer key : map.keySet()) {
      if (map.get(key) > 1) {
        System.out.println(key);
      }
    }
  }
}
