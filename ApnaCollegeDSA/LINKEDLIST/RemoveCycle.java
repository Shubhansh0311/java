package LINKEDLIST;

public class RemoveCycle {
  Node head;

  
  static class Node {

    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static void RemoveTheCycle(Node head) {
    // detect a cycle
    Node slow = head;
    Node fast = head;
    boolean cycle = false;
    while (slow != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        cycle = true;
        break;
      }
    }
    //finding the meeting point
    slow = head;
    Node prev = null; //last node
    while (slow != fast) {
      prev = fast;
      slow = slow.next;
      fast = fast.next;
    }

    // removing the cycle  by making the prev.next=null;
    prev.next = null;
  }

  public static boolean isCycle(Node head) {
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    Node head = new Node(1);
    Node temp = new Node(2);
    head.next = temp;
    head.next.next = new Node(3);
    head.next.next.next = temp;
    System.out.println(isCycle(head));
    RemoveTheCycle(head);
    System.out.println(isCycle(head));
  }
}
