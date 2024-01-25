package QUEUE;

import java.rmi.Remote;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InterleaveTwoQueue {

  public static void Qreverse(Queue<Integer> q) {
    int size = q.size();
    Stack<Integer> s = new Stack<>();

    for (int i = 0; i < size; i++) {
      s.push(q.remove());
    }

    while (!s.isEmpty()) {
      q.add(s.pop());
    }
    while (!q.isEmpty()) {
      System.out.print(q.peek()+" ");
      q.remove();
    }
  }

  public static void main(String args[]) {
    Queue<Integer> q = new LinkedList<>();
    Queue<Integer> q1 = new LinkedList<>();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    q.add(6);
    System.out.println(q);
    Qreverse(q);
  }
}
