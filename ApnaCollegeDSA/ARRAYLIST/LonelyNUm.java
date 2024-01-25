package ARRAYLIST;

import java.util.ArrayList;
import java.util.Collections;

public class LonelyNUm {

  public static ArrayList isAlone(ArrayList<Integer> arr) {
    Collections.sort(arr);
    ArrayList<Integer> newarr = new ArrayList<>();
    for (int i = 1; i < arr.size() - 1; i++) {
      if (arr.get(i - 1) + 1 < arr.get(i) && arr.get(i) + 1 < arr.get(i + 1)) {
        newarr.add(arr.get(i));
      }
    }
    if (arr.size() == 1) {
      newarr.add(arr.get(0));
    }
    if (arr.size() > 1) {
      if (arr.get(0) + 1 < arr.get(1)) {
        newarr.add(arr.get(0));
      }
      if (arr.get(arr.size() - 2) + 1 < arr.get(arr.size() - 1)) {
        newarr.add(arr.get((arr.size() - 1)));
      }
    }

    return newarr;
  }

  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(10);
    arr.add(6);
    arr.add(5);
    arr.add(8);
    System.out.println(isAlone(arr));

  
  }
}
