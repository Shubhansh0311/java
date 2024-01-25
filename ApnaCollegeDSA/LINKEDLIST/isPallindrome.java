package LINKEDLIST;

import java.util.LinkedList;

public class isPallindrome {

  // find the mid of for the next half slow 👉👉👉SLOW FAST APPROACH
  // reverse the second half
  // compare the head values of the two halves

  Node head;

  static class Node {

    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public void addFirst(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  public void print() {
    if (head == null) {
      System.out.println("list is empty");
      return;
    }
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "->");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public Node findMid(Node head) {
    Node slow = head;
    Node fast = head.next;
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }
    return slow;
  }

  public boolean checkPallindrome() {
    // find the mid that is the head for the second half
    Node mid = findMid(head);

    // reverse the linked list

    //  ❗❗❗❗❗❗❗❗❗❗❗❗❗❗❗most important mid.next
    Node curr = mid.next;
    mid.next = null;

    Node prev = null;
    Node next;
    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    Node firstHalf = head;
    Node secondHalf = prev;
    while (firstHalf != null) {
      if (secondHalf.data != firstHalf.data) {
        return false;
      }
      firstHalf = firstHalf.next;
      secondHalf = secondHalf.next;
    }

    return true;
  }

  public void reverse() {
    Node curr = head;
    Node prev = null;
    Node next;
    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    head = prev;
  }

  public static void main(String[] args) {
    isPallindrome ll = new isPallindrome();
    ll.addFirst(8);
    ll.addFirst(7);
    ll.addFirst(6);
    ll.addFirst(5);
    ll.addFirst(4);
    ll.addFirst(3);
    ll.addFirst(2);
    ll.addFirst(1);
    ll.print();
    // ll.reverse();

    ll.print();
    // boolean ans = ll.checkPallindrome();
    // System.out.println(ans);

  }
}
