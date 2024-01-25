package ARRAY;

import java.util.*;

public class Solution {

  public static void main(String[] args) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int arr[] = { 10, 2, -2, -20, 10 };
    int sum = 0, ans = 0, k = -20;
    map.put(0, 1);
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      if (map.containsKey(sum - k)) {
        ans += map.get(sum);
      } 
        map.put(sum, map.getOrDefault(0, 1) + 1);
      
    }
    System.out.println(ans);
  }
}
