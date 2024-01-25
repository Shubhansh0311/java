package STACK.PROBLEMS;

import java.util.Stack;

public class NextGreater {

  public static void main(String[] args) {
    int arr[] = { 1, 5, 9, 3, 2 };
    Stack<Integer> s = new Stack<>(); //here we are using stack for storing the indexes of the element
    int nxtGreater[] = new int[arr.length];

    // here were are following the reverse approach
    for (int i = arr.length - 1; i >= 0; i--) {
      while (!s.isEmpty() && arr[i] >= arr[s.peek()]) {
        s.pop();
      }
      if (s.isEmpty()) {
        nxtGreater[i] = -1;
      } else {
        nxtGreater[i] = arr[s.peek()];
      }
      s.push(i);
    }
    for (int i = 0; i < nxtGreater.length; i++) {
      System.out.print(nxtGreater[i] + " ");
    }
  }
}
