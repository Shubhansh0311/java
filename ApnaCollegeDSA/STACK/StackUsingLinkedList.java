package STACK;

public class StackUsingLinkedList {

  static class Node {

    int data;
    Node next;

    Node(int data) { //add new node whenever node is called
      this.data = data;
      this.next = null;
    }
  }

  static class Stack {

    static Node head;

    public boolean isEmpty() {
      return head == null;
    }

    public void push(int data) {
      Node newNode = new Node(data);
      if (isEmpty()) {
        head = newNode;
        return;
      }
      newNode.next = head;
      head = newNode;
    }

    public int pop() {
      if (isEmpty()) {
        return -1;
      }
      int top = head.data;
      head = head.next;
      return top;
    }

    public int peek() {
      return head.data;
    }
  }

  public static void main(String[] args) {
    Stack s = new Stack();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    while (!(s.isEmpty())) {
      System.out.println("peek = " + s.peek() + " pop  = " + s.pop());
    }
  }
}
