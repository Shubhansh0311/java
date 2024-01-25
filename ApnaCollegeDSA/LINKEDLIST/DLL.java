package LINKEDLIST;

import HASHSET.Hashset1;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import javax.print.attribute.HashAttributeSet;

public class DLL {

  static Node head, tail;
  static int size = 0;

  static class Node {

    int data;
    Node next, prev;

    Node(int data) {
      this.data = data;
      this.next = null;
      this.prev = null;
    }
  }

  public void addFirst(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      return;
    }
    newNode.next = head;
    head.prev = newNode;
    head = newNode;
    size++;
  }

  public void addlast(int data) {
    Node newnode = new Node(data);
    if (head == null) {
      head = tail = newnode;
    }
    tail.next = newnode;
    newnode.prev = tail;
    tail = newnode;
  }

  public void print() {
    if (head == null) {
      return;
    }
    Node temp = head;
    System.out.print("NULL->");
    while (temp != null) {
      System.out.print(temp.data + "->");
      temp = temp.next;
    }
    System.out.println("NULL");
  }

  public void printreverse() {
    if (tail == null) {
      return;
    }
    Node temp = tail;
    System.out.print("null->");
    while (temp != null) {
      System.out.print(temp.data + "->");
      temp = temp.prev;
    }
    System.out.print("null->");
  }

  public int removefirst() {
    if (head == null) {
      return Integer.MIN_VALUE;
    }
    if (head.next == null) {
      int val = head.data;
      head = tail = null;
      size--;
      return val;
    }
    int val = head.data;
    head = head.next;
    head.prev = null;
    return val;
  }

  public int removelast() {
    if (tail == null) {
      return Integer.MIN_VALUE;
    }

    if (head.next == null) {
      int val = head.data;
      head = tail = null;
      size--;
      return val;
    }
    int val = tail.data;
    tail = tail.prev;

    tail.next = tail.next.next;

    return val;
  }

  public static void main(String[] args) {
    DLL d = new DLL();
    d.addFirst(5);
    d.addFirst(4);
    d.addFirst(3);
    d.addFirst(2);
    d.addFirst(1);
    d.addlast(10);
    d.addlast(11);
    d.addlast(12);
    d.addlast(13);
    d.addlast(14);
    d.print();
    System.out.println();
    d.printreverse();
    System.out.println();
    // System.out.println(d.removefirst());
    System.out.println(d.removelast());
    System.out.println(d.removelast());
    System.out.println(d.removelast());
    System.out.println(d.removelast());
    System.out.println(d.removelast());
    System.out.println(d.removelast());
    System.out.println(d.removelast());
    System.out.println(d.removelast());
    System.out.println(d.removelast());
    System.out.println(d.removelast());

    Scanner sc = new Scanner(System.in);
    String str = "talent";
    HashSet<Character> set = new HashSet<>();
    String c = "";
    // for (int i = 0; i < str.length(); i++) {
    //   s.add(str.charAt(i));
    // }
    String str1 = "ten";

    for (int i = 0; i < str.length(); i++) {
      set.add(str.charAt(i));
    }

    for (int i = 0; i < str1.length(); i++) {
      set.remove(str1.charAt(i));
    }

    for (Character ch : set) {
      c += ch;
    }
    System.out.println(c);
  }
}
