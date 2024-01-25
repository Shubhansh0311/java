package QUEUE;

public class IMPLEMENTATIONusingArray {

  static class Queue {

    int arr[];
    int size;
    int rear; //to insert the element

    Queue(int n) {
      arr = new int[n];
      this.size = n;
      rear = -1;
    }

    public boolean isEmpty() {
      return rear == -1;
    }

    public void add(int data) {
      if (rear == size - 1) {
        System.out.println("queue if fulll");
        return;
      }
      // rear is initialized with -1 so increasing its value
      rear = rear + 1;
      arr[rear] = data;
    }

    //remove

    public int remove() {
      if (isEmpty()) {
        return -1;
      }
      int front = arr[0];
      //   now we have to shift the element one position forward

      for (int i = 0; i < rear; i++) {
        arr[i] = arr[i + 1];
      }
      rear--;
      return front;
    }

    public int peek() {
      if (isEmpty()) {
        return -1;
      }
      return arr[0];
    }
  }

  public static void main(String[] args) {
    Queue q = new Queue(5); //here 5 is the size of the queue
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    q.add(6);
    while (!q.isEmpty()) {
      System.out.println(q.peek());
      q.remove();
    }
  }
}
