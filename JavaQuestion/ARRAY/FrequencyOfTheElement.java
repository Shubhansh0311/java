package ARRAY;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FrequencyOfTheElement {

  public static LinkedHashMap<Integer, Integer> findFrequency(int arr[]) {
    LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
    for (int i = 0; i < arr.length; i++) {
      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    }

    return map;
  }

  public static void main(String[] args) {
    int arr[] = { 10, 45, 30, 10, 20, 10, 20, 30, 10 };

    LinkedHashMap<Integer, Integer> map = findFrequency(arr);
    for (Integer i : map.keySet()) {
      System.out.println(i + " occurs " + map.get(i));
    }
  }
}
