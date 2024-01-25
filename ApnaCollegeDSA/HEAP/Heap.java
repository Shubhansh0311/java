package HEAP;

import BINARYTREES.MinDistance;
import java.util.ArrayList;

public class Heap {

  static class heap {

    static ArrayList<Integer> arr = new ArrayList<>();

    public void add(int data) {
      arr.add(data);
      int x = arr.size() - 1;
      int par = (x - 1) / 2;
      while (arr.get(x) < arr.get(par)) {
        int temp = arr.get(x);
        arr.set(x, arr.get(par));
        arr.set(par, temp);
      }
    }

    public int peek() {
      return arr.get(0);
    }

    // to fix the tree we need to heapify the tree
    private void heapify(int i) {
      int left = 2 * i + 1;
      int right = 2 * i + 2;
      int minIdx = i;
      if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
        minIdx = left;
      }
      if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
        minIdx = right;
      }
      if (minIdx != i) {
        int temp = arr.get(i);
        arr.set(i, arr.get(arr.size() - 1));
        arr.set(minIdx, temp);
        heapify(minIdx);
      }
    }

    public int remove() {
      // swap
      int temp = arr.get(0);
      arr.set(0, arr.get(arr.size() - 1));
      arr.set(arr.size() - 1, temp);

      // remove
      arr.remove(arr.size() - 1);
      // to fix the tree
      heapify(0);
      return temp;
    }

    public void printList() {
      int i = 0;
      while (i < arr.size() - 1) {
        // System.out.println(arr.);
      }
    }
  }

  public static void main(String[] args) {
    heap h = new heap();
    h.add(5);
    h.add(3);
    h.add(4);
    h.add(2);
    h.add(10);
    // System.out.println(h.peek());
    System.out.println(h.remove());
    System.out.println(h.remove());
  }
}
