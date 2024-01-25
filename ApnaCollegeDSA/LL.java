public class LL {
    Node head;

    int size=0;

    class Node {
        Node next;
        int data;

      
        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node headNew = head;

        while (headNew.next != null) {
            headNew = headNew.next;

        }
        headNew.next = newNode;

    }

    public void deletefirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;

        head = head.next;
    }
//deleting at the last
    public void deletelast() {
        if (head == null) {
            System.out.println("list is empty");

        }
        if (head.next == null) {
            head = null;
            return;
        }
        size--;
        Node secondlast = head;
        Node last = head.next;
        while (last.next!= null) {
            last =last.next;
            secondlast=secondlast.next;
        }
        secondlast.next = null;

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

    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.println(currNode.data);
            currNode = currNode.next;

        }

    }
    public int printSize(){
        return size;
    }

    public static void main(String[] args) {
        LL list = new LL();
      list.addFirst(10);
      list.addFirst(11);
      list.addFirst(12);
      list.addFirst(12);
      list.addFirst(12);
      list.addFirst(12);
      list.addFirst(12);
      list.addLast(14);
      list.deletefirst();
      list.deletelast();
      list.printList();
System.out.println("the size of the list is "+list.printSize());
    }


}