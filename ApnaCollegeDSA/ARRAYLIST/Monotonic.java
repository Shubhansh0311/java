package ARRAYLIST;

import java.util.ArrayList;

public class Monotonic {

  public static boolean isMonotonic(ArrayList<Integer> arr) {
    if (arr.size() == 0) {
      return true;
    }

    boolean in = false, de = false;
    for (int i = 0; i < arr.size() - 1; i++) {
      if (arr.get(i) > arr.get(i + 1)) {
        in = true;
      }
      else {
        de = true;
      }
    }

    return de != in;
  }

  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(4);
    arr.add(3);
    arr.add(2);
    System.out.println(isMonotonic(arr));
  }
}
