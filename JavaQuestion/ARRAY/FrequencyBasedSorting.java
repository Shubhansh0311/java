package ARRAY;

import java.util.Comparator;
import java.util.TreeMap;

public class FrequencyBasedSorting {

  public static void main(String[] args) {
    int arr[] = { 10, 20, 20, 20, 20, 20, 30, 30, 10, 10, 0 };
    // 30,30,30,20,20,10;
    TreeMap<Integer, Integer> map = new TreeMap<>();
    TreeMap<Integer, Integer> valueMap = new TreeMap<>(
      Comparator.reverseOrder()
    );
    for (int i = 0; i < arr.length; i++) {
      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    }
    int i = 0;
    for (Integer key : map.keySet()) {
      valueMap.put(map.get(key), key);
    }
    for (Integer key : valueMap.keySet()) {
      for (int k = 0; k < key; k++) {
        
        arr[i] = valueMap.get(key);
        i++;
      }
    }
    //   n--;

    for (int k = 0; k < arr.length; k++) {
      System.out.print(arr[k] + " ");
    }
  }
}
