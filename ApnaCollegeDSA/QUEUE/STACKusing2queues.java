package QUEUE;

import java.security.cert.PKIXBuilderParameters;
import java.util.Stack;

public class STACKusing2queues {

  static class Queue {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public boolean isEmpty() {
      return s2.isEmpty();
    }

    public void add(int data) {
      s2.push(data);
    }

    public int remove() {
      if (isEmpty()) {
        return -1;
      }
      while (!s1.isEmpty()) {
        s1.push(s1.pop());
      }
      while (!s1.isEmpty()) {
        s2.push(s1.pop());
      }
      return s2.pop();
    }

    public int peek() {
      if (isEmpty()) {
        return -1;
      }

      return s2.peek();
    }
  }

  public static void main(String[] args) {
    Queue q = new Queue();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    while (!q.isEmpty()) {
      System.out.println(q.peek());
      q.remove();
    }
  }
}
