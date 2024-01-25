package QUEUE;

public class IMPLEMENTATIONUSING_LLS {

  static class Node {

    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }

  static class Queue {

    Node head = null;
    Node tail = null;

    public boolean isEmpty() {
      return head == null && tail == null;
    }

    public void add(int data) {
      Node newnode = new Node(data);
      if (head == null) {
        head = tail = newnode;
        return;
      }
      tail.next = newnode;
      tail = newnode;
    }

    public int remove() {
      if (isEmpty()) {
        return -1;
      }

      int first = head.data;
      if (head == tail) {
        tail = head = null;
      } else {
        head = head.next;
      }
      return first;
    }

    public int peek() {
      if (isEmpty()) {
        return -1;
      }
      return head.data;
    }
  }

  public static void main(String[] args) {
    Queue q = new Queue();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    System.out.println(q.peek());
    while (!q.isEmpty()) {
      System.out.println(q.peek());
      q.remove();
    }
  }
}
