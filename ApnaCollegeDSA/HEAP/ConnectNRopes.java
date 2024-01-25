package HEAP;

// connect the n ropes with the cost lesser then the total sum

import java.util.PriorityQueue;

public class ConnectNRopes {

  public static void main(String[] args) {
    int arr[] = { 2, 3, 3, 4, 6 };
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for (int i = 0; i < arr.length; i++) {
      pq.add(arr[i]);
    }
    
    int cost = 0;
    while (pq.size() > 1) {
      int a = pq.remove();
      int b = pq.remove();
      cost += a + b;
      pq.add(a + b);
  
    }
    System.out.println(cost);
  }
}
