package HASHMAP;

import java.util.HashSet;

public class HashMapUnionIntersection {

  public static void main(String[] args) {
    int arr1[] = { 7, 3, 9 };

    int arr2[] = { 6, 3, 9, 6, 2, 4 };
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < arr1.length; i++) {
      int n = arr1[i];
      set.add(n);
    }

    for (int i = 0; i < arr2.length; i++) {
      int n = arr2[i];
      set.add(n);
    }
    System.out.println("union of the arrays is " + set.size());
    HashSet<Integer> intersection = new HashSet<>();
    int count = 0;
    for (int i = 0; i < arr1.length; i++) {
      int n = arr1[i];
      intersection.add(n);
    }
    for (int i = 0; i < arr2.length; i++) {
      if (intersection.contains(arr2[i])) {
        count++;
        intersection.remove(arr2[i]);
      }
    }
    System.out.println("intersection == " + count);
  }
}
