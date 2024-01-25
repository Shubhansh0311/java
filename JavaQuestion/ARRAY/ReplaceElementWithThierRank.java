package ARRAY;

import java.util.*;

public class ReplaceElementWithThierRank {

  public static int[] replace(int arr[]) {
    LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
    for (int i = 0; i < arr.length; i++) {
      map.put(arr[i], i);
    }

    Arrays.sort(arr);
    // System.out.print(Arrays.toString(arr));

    for (int i = 0; i < arr.length; i++) {
      if (map.containsKey(arr[i])) {
        map.put(arr[i], i + 1);
      }
    }
      int i=0;
   

      for(Integer key:map.keySet()){
        arr[i]=map.get(key);
        i++;
      }
     

    return arr;
  }

  public static void main(String[] args) {
    int[] arr = { 100, 2,40,54, 70, 12, 90 };
    System.out.println(Arrays.toString(arr));
    int newarr[] = replace(arr);

    System.out.println(Arrays.toString(newarr));
  }
}
