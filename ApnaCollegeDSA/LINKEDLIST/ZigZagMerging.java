package LINKEDLIST;

import java.sql.RowId;

public class ZigZagMerging {

  Node head;

  static class Node {

    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static void printList(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }

  public static Node findMid(Node head) {
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }
    return slow;
  }

  public static Node reverse(Node head) {
    Node mid = findMid(head);

    Node next;
    
    Node curr = mid.next;
    mid.next=null;




    Node prev = null;
    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    Node left = head;
    Node right = prev;//head of right part

    Node nextL, nextR;
    while (left!= null && right != null) {
      nextL = left.next;
      left.next = right;
      nextR = right.next;
      right.next = nextL;
      left = nextL;
      right = nextR;
    }
    return head;
  }

  public static void main(String[] args) {
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = new Node(5);
    head.next.next.next.next.next = new Node(6);
    head.next.next.next.next.next.next = new Node(7);
    printList(head);
    System.out.println();
    printList(reverse(head));
  }
}
