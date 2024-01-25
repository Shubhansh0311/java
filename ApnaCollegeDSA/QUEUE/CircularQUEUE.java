package QUEUE;

import javax.naming.spi.DirStateFactory.Result;
import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class CircularQUEUE {

  static class Queue {

    int arr[];
    int size;
    int rear; //to insert the element
    int front; // to store the index of the front

    Queue(int n) {
      arr = new int[n];
      this.size = n;
      rear = -1;
      front = -1;
    }

    public boolean isEmpty() {
      return rear == -1;
    }

    public boolean isfull() {
      return (rear + 1) % size == front;
    }

    public void add(int data) {
      if (isfull()) {
        System.out.println("queue if fulll");
        return;
      }
      if (front == -1) {
        front = 0;
      } // rear is initialized with -1 so increasing its value
      rear = (rear + 1) % size;
      arr[rear] = data;
    }

    //remove

    public int remove() {
      if (isEmpty()) {
        return -1;
      }
      int result = arr[front];
      if (rear == front) {
        return front = rear = -1;
      } else {
        front = (front + 1) % size;
      }

      //   now we have to shift the element one position forward
      return result;
    }

    public int peek() {
      if (isEmpty()) {
        return -1;
      }
      return arr[front];
    }
  }

  public static void main(String[] args) {
    Queue q = new Queue(3); //here 5 is the size of the queue
    q.add(1);
    q.add(2);
    q.add(3);

    //this will work only in case of circular queue
    // System.out.println(q.remove());
    q.add(4);
    System.out.println(q.remove());
    q.add(5);
    System.out.println(q.remove());
    while (!q.isEmpty()) {
      System.out.println(q.peek());
      q.remove();
    }
  }
}
