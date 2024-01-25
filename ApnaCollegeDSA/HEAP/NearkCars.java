package HEAP;

import java.util.*;

public class NearkCars {

  static class Cars implements Comparable<Cars> {

    int x;
    int y;
    int mindist, idx;

    Cars(int x, int y, int mindist, int idx) {
      this.x = x;
      this.y = y;
      this.mindist = mindist;
      this.idx = idx;
    }

    @Override
    public int compareTo(Cars c) {
      return this.mindist - c.mindist;
    }
  }

  public static void main(String[] args) {
    int arr[][] = { { 3, 3 }, { 5, -2 }, { -2, 4 } };
    int k = 2;
    PriorityQueue<Cars> pq = new PriorityQueue<>();

    for (int i = 0; i < arr.length; i++) {
      int sqrdist = arr[i][0] * arr[i][0] + arr[i][1] * arr[i][1];
      pq.add(new Cars(arr[i][0], arr[i][1], sqrdist, i));
    }

    for (int i = 0; i<k; i++) {
      System.out.println("C"+pq.remove().idx);
    }
  }
}
