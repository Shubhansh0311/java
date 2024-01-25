package LINKEDLIST;

public class DeleteNnodeAfterMnodes {

  Node head;

  static class Node {

    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public void delete(int M, int N) {
    Node curr = head, t;
    int count;

    while (curr != null) {
      for (count = 1; count < M && curr != null; count++) {
        curr = curr.next;
      }
      if (curr == null) {
        return;
      }
      t = curr.next;
      for (count = 1; count < N && t != null; count++) {
        Node temp = t;
        t = t.next;
      }
      curr.next = t;
      curr = t;
    }
  }
}
