package HASHSET;

import java.util.HashSet;

public class Hashset1 {

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 5, 6, 7, 8, 9 };
    HashSet<Integer> hs = new HashSet<>();
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
        hs.add(arr[i]);
    }
    System.out.println(hs);
  }
}
