package STACK.PROBLEMS;

import java.util.Stack;

public class ISlinkedlistPallindrome {

  static class Node {

    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static boolean isPallindrome(Node head) {
    Node start = head;
    boolean isPallin = false;
    Stack<Integer> s = new Stack<>();
    while (start != null) {
      s.push(start.data);
      start = start.next;
    }
    while (head != null) {
      int i = s.pop();
      if (head.data == i) {
        isPallin = true;
      } else {
        isPallin = false;
      }
      head = head.next;
    }
    return isPallin;
  }

  public static void main(String[] args) {
    Node one = new Node(7);
    Node two = new Node(2);
    Node three = new Node(3);
    Node four = new Node(3);
    Node five = new Node(1);
    Node six = new Node(1);
    one.next = two;
    two.next = three;
    three.next = four;
    four.next = five;
    five.next = six;

    boolean ans = isPallindrome(one);
    System.out.println(ans);
  }
}
