package DEQUE;

import java.util.Deque;
import java.util.LinkedList;

public class Stack_using_deque {

  static class Stack {

    Deque<Integer> deque = new LinkedList<>();

    public boolean isEmpty() {
      return deque.isEmpty();
    }

    public void push(int data) {
      deque.addLast(data);
    }

    public int pop() {
      if (isEmpty()) {
        return -1;
      }
      return deque.removeLast();
    }

    public int peek() {
      return deque.removeLast();
    }
  }

  public static void main(String[] args) {
    Stack s = new Stack();

    System.out.println(s.pop());
  }
}
