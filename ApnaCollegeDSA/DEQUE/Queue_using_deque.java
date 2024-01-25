package DEQUE;

import java.util.Deque;
import java.util.LinkedList;

public class Queue_using_deque {

  static class Queue {

    Deque<Integer> de = new LinkedList<>();

    public boolean isEmpty() {
      return de.isEmpty();
    }

    public void add(int data) {
      de.addLast(data);
    }

    public int remove() {
      if (isEmpty()) {
        return -1;
      }
      return de.removeFirst();
    }

    public int peek() {
      if (isEmpty()) {
        return -1;
      }
      return de.removeFirst();
    }
  }

  public static void main(String[] args) {
    Queue q = new Queue();
    q.add(0);
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    while (!q.isEmpty()) {
      System.out.println(q.remove());
    }
  }
}
