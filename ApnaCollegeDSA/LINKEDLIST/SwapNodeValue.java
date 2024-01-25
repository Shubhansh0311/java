package LINKEDLIST;

public class SwapNodeValue {
    Node head;

    static class Node{
        Node next;
        int data;
        
    }
    public void swap(int x, int y) {
    if (x == y) {
      return;
    }
    Node currX = head;
    Node next;
    Node prevX = null;

    while (currX != null && currX.data != x) {
      prevX = currX;
      currX = currX.next;
    }
    Node currY = head, prevY = null;
    while (currY != null && currY.data != y) {
      prevY = currY;
      currY = currY.next;
    }
    if (currX == null || currY == null) {
      return;
    }
    if (prevX != null) {
      prevX.next = currY;
    } else {
      head = currY;
    }
    if (prevY != null) {
      prevY.next = currX;
    } else {
      head = currX;
    }
    Node temp = currX.next;
    currX.next = currY.next;
    currY.next = temp;
  }
}
