package HASHMAP;

import java.util.HashMap;

public class HashMapLargestSubArraylength {

  public static void main(String[] args) {
    int sum = 0;
    int length = 0;
    HashMap<Integer, Integer> map = new HashMap<>();

    int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      System.out.println(sum);
      if (map.containsKey(sum)) {
        length = Math.max(length, i - map.get(sum));// i=index  & map.get(sum)==index value of the sum

      } else {
        map.put(sum, i); //storing the value of sum if it doesn't exist 

      }
      
    }
    System.out.println(length);
  }
}
