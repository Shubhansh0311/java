import java.util.LinkedList;
import javax.sql.rowset.spi.SyncResolver;
import javax.xml.namespace.QName;

class LLs {

  Node head;
  static int size = 0;

  public class Node {

    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public void addFirst(int data) {
    Node newnode = new Node(data);
    if (head == null) {
      // head.next = newnode;
      head = newnode;
      size++;
      return;
    }
    newnode.next = head;
    head = newnode;
    size++;
  }

  // ------------------------------------------------addlast

  public void addLast(int data) {
    Node newnode = new Node(data);
    if (head == null) {
      head = newnode;
      size++;

      return;
    }
    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = newnode;
    size++;
  }

  public void addMiddle(int data, int index) {
    Node newnode = new Node(data);
    int i = 1;
    if (index > size) {
      System.out.println("enter valid index");
      return;
    }
    Node temp = head;
    if (head == null) {
      head = newnode;
      size++;
    }

    while (i < index) {
      temp = temp.next;
      i++;
    }
    newnode.next = temp.next;
    temp.next = newnode;
    size++;
  }

  public void print() {
    Node currNode = head;
    if (head == null) {
      System.out.println("list is empty ");
    }
    while (currNode != null) {
      System.out.print(currNode.data + " -> ");
      currNode = currNode.next;
    }
    if (head != null) System.out.println(" END");
  }

  public void removefirst() {
    if (head == null) {
      System.out.println("list is empty");
    }
    head = head.next;
  }

  public void removelast() {
    Node currNode = head;
    while (currNode.next.next != null) {
      currNode = currNode.next;
    }
    currNode.next = null;
  }

  public void removeMiddle(int index) {
    Node temp = head;
    for (int i = 1; i < index; i++) {
      temp = temp.next;
    }
    temp.next = temp.next.next;
  }

  public int searchindex(int data) {
    Node temp = head;
    int i = 0;
    while (i < size) {
      if (temp.data == data) {
        return i;
      }
      temp = temp.next;
      i++;
    }
    return -1;
  }

  public int searchre(Node head, int index, int data) {
    if (head == null) {
      return -1;
    }
    if (head.data == data) {
      return index;
    }
    return searchre(head.next, index + 1, data);
  }

  public int searchRecursive(int data) {
    // Node temp = head;

    return searchre(head, 0, data);
  }

  // ----------------------------------------------------------------ReverseaList

  public void Reversing() {
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

  // public boolean isPallindrome(LinkedList<Character> list) {
  //   int i;
  //   int j = list.size() - 1;

  //   for (i = 0; i <= list.size() / 2; i++) {
  //     System.out.println(i + " " + j);
  //     if (list.get(i) != list.get(j - i)) {
  //       return false;
  //     }
  //   }
  //   return true;
  // }

  // public LinkedList<Character> reverse(LinkedList<Character> list) {
  //   LinkedList<Character> list2 = new LinkedList<>();

  //   int j = list.size() - 1;
  //   for (int i = 0; i < list.size() && j >= 0; i++, j--) {
  //     list2.add(i, list.get(j));
  //   }
  //   return list2;
  // }

  // ----------------------------------------------------------------------------------------check pallindrome
  public Node findMiddle(Node head) {
    Node slow = head;
    Node fast = head;
    while (slow != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  public boolean checkPallindrome() {
    if (head == null || head.next == null) {
      return true;
    }
    // finding middle
    Node mid = findMiddle(head);

    // Reversing the second half of the list

    Node curr = mid;
    mid.next=null;
    Node prev = null;
    Node next;
    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    Node right = prev;
    Node left = head;
    //checking whether the right and left half have the same data or not
    while (right != null) {
      if (left.data != right.data) {
        return false;
      }
      left = left.next;
      right = right.next;
    }

    return true;
  }

  public static void main(String[] args) {
    LLs list = new LLs();

    list.addFirst(3);
    list.addFirst(3);
    list.addLast(1);
    list.addLast(1);
    list.addLast(3);
    list.addLast(3);

    list.print();
    // list.Reversing();
    // list.print();
    // int ans = list.searchRecursive(110);
    // System.out.println("the index of the element is  = " + ans);
    list.print();
    System.out.println(list.checkPallindrome());
    //     // System.out.println(size);
    //     int index = list.searchindex(5);
    // System.out.println(list);

    //     if (index > 0) {
    //       System.out.println("index of the element " + index);
    //     } else {
    //       System.out.println("element not found ");
    //     }

    //   LinkedList<Character> list1 = new LinkedList<Character>();
    //   list1.add('a');
    //   list1.add('b');
    //   list1.add('c');
    //   list1.add('d');
    //   list1.add('e');
    //   list1.add('f');
    //   list1.add('g');
    //   System.out.println(list1);
    //   boolean ans = list.isPallindrome(list1);
    //   System.out.println("linked list is pallindrome ? " + ans);
    //   System.out.println(list.reverse(list1));
    // }
  }
}
