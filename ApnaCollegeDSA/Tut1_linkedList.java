import javax.security.auth.login.CredentialException;

public class Tut1_linkedList {
    Node head;
    int size;
    Tut1_linkedList(){
        this.size=0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // 👉adding element at the first of the linkded list
    public void addFirst(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    // 👉adding element at the last of the linked list
    public void addLast(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;

        }
        // assigning the value of head to another node in order to not to lost head
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;

        }
        currNode.next = newnode;

    }

    // 👉printing the list
    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("NULL");
    }

    // 👉deleting the element at the first
    public void deletefirst() {
        if (head == null) {
            System.out.print("list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // 👉deleting at the last
public void deletelast(){
    if(head==null){
        System.out.print("list is empty");
    }
    if(head.next==null){
        head=null;
        return;
    }
    size--;
    Node secondlast=head;
    Node lastnode=head.next;
    while(lastnode.next!=null){
        lastnode=lastnode.next;
        secondlast=secondlast.next;
    }
   secondlast.next=null;

}
//👉getting the size of the list
public int getSize(){
    return size;
}
    public static void main(String[] args) {
        Tut1_linkedList list = new Tut1_linkedList();
        list.addFirst("am");
        list.addFirst("i");
        list.addLast("shubhansh");
        list.deletelast();
      list.printList();

    }
}