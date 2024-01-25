package LINKEDLIST;

import HASHSET.Hashset1;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import javax.print.attribute.HashAttributeSet;

public class EVENbeforeODD {

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

  public void evenOdd() {
    Node curr = head;
    Node prev = null;
    Node next;
    Node prevtail = head;

    while (prevtail.next != null) {
      prevtail = prevtail.next;
    }
    Node tail = prevtail;//here we get the end of the ll
    // prevtail==end

    // add odd number at the end
    while (curr.data % 2 != 0 && curr != prevtail) {
      tail.next = curr;
      curr = curr.next;
      tail.next.next = null;
      tail = tail.next;
    }

    // checking for even case
    // even number
    if (curr.data % 2 == 0) {
      head = curr;
      while (curr != prevtail) {
        if (curr.data % 2 == 0) {
          prev = curr;
          curr = curr.next;
        } else {
          prev.next = curr.next; //add to back of the even number in case it's the odd number
          curr.next = null;
          tail.next = curr; //adding the new odd number after the last tail

          tail = curr; //updating the tail
          curr = prev.next;
        }
      }
    } else {
      prev = curr;
      if (tail != prevtail && prevtail.data % 2 != 0) {
        prev.next = prevtail.next;
        prevtail.next = null;
        tail.next = prevtail;
      }
    }
  }

  public static void main(String[] args) {
    EVENbeforeODD d = new EVENbeforeODD();
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
    d.evenOdd();
    d.print();
  }
}
