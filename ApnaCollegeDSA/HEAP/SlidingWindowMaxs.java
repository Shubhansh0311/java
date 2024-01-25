package HEAP;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import javax.lang.model.type.PrimitiveType;

public class SlidingWindowMaxs {

  public static ArrayList sliding(int arr[], int k, int n) {
    ArrayList<Integer> res = new ArrayList<>();

    PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
    // adding the first window
    for (int i = 0; i < k; i++) {
      pq.add(arr[i]);
    }
    res.add(pq.peek());
    pq.remove(arr[0]);
    for (int i = k; i < n; i++) {
      pq.add(arr[i]);
      res.add(pq.peek());
      pq.remove(arr[i - k + 1]);
    }
    return res;
  }

  public static void main(String[] args) {
    int array[] = { 1, 3, -1, -3, 4, 2, 5 };
    ArrayList<Integer> arr = sliding(array, 3, array.length);
    for (int i = 0; i < arr.size(); i++) {
      System.out.print(arr.get(i) + " ");
    }
  }
}
