package LINKEDLIST;

public class MergeSortOverLL {

  Node head;

  static class Node {

    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node findmiddle(Node head) {
    Node slow = head;
    Node fast = head.next;
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }
    return slow;
  }

  private static Node merging(Node head1, Node head2) {
    if (head1 == null && head2 == null) {
      return null;
    }
    Node mergell = new Node(-1);
    Node temp = mergell;

    while (head1 != null && head2 != null) {
      if (head1.data <= head2.data) {
        temp.next = head1;
        head1 = head1.next;
        temp = temp.next;
      } else  {
        temp.next = head2;
        head2 = head2.next;
        temp = temp.next;
      }
    }

    while (head1 != null) {
      temp.next = head1;
      temp = temp.next;
      head1 = head1.next;
    }
    while (head2 != null) {
      temp.next = head2;
      temp = temp.next;
      head2 = head2.next;
    }
    return mergell.next;
  }

  public static Node merge(Node head) {
    if (head == null || head.next == null) {
      return head;
    }
    //dividing the ll in two equal halves
    Node mid = findmiddle(head);
    Node head2 = mid.next;
    mid.next = null;
    //
    Node newleft = merge(head);
    Node newright = merge(head2);

    return merging(newleft, newright);
  }

  public static void printlist(Node head) {
    if (head == null) {
      System.out.println("null");
    }
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " -> ");
      temp = temp.next;
    }
    System.out.println("NULL");
  }

  public static void main(String[] args) {
    Node head = new Node(11);

    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next = new Node(9);
    head.next.next.next = new Node(1);
    head.next.next.next.next = new Node(8);
    head.next.next.next.next.next = new Node(8);
    head.next.next.next.next.next.next = null;
    printlist(head);
    // printlist(n);
    Node n = merge(head);
    System.out.println();
    printlist(n);
    // printlist();
  }
}
