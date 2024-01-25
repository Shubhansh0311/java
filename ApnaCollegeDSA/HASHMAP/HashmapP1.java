package HASHMAP;

import java.util.HashMap;
import java.util.Set;

public class HashmapP1 {

  public static void main(String[] args) {
    int arr[] = { 1, 3, 3, 3, 3, 2, 5, 1, 3, 1, 5, 1 };
    HashMap<Integer, Integer> hm = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
      //   int num = arr[i];
      //   if (hm.containsKey(num)) {
      //     hm.put(num, (hm.get(num) + 1));
      //   } else {
      //     hm.put(num, 1);
      //   }

      //    or
      hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
    }

    //for counting frequenchy
    // Set<Integer> keyset = hm.keySet();
    for (Integer key : hm.keySet()) {
      if (hm.get(key) > arr.length / 3) System.out.println(key);
    }
  }
}
