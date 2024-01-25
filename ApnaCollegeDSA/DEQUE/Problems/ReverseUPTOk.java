package DEQUE.Problems;

import java.util.Deque;
import java.util.LinkedList;

// 1,2,3,4,5,6,7,8,9,10
// k=3
// 3,2,1,4,5,6,7,8,9,10
public class ReverseUPTOk {

  public static void main(String args[]) {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int k =6;
    Deque<Integer> d = new LinkedList<>();
    for (int i = 0; i < k; i++) {
      d.addFirst(arr[i]);
    }
    for (int i = k; i < arr.length; i++) {
      d.addLast(arr[i]);
    }
    System.out.println(d);
  }
}
