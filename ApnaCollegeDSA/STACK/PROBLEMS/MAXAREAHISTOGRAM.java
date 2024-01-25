package STACK.PROBLEMS;

import java.util.Stack;

public class MAXAREAHISTOGRAM {

  public static void MAXAREA(int arr[]) {
    Stack<Integer> s = new Stack<>();
    int nsl[] = new int[arr.length];
    int nsr[] = new int[arr.length];

    //nsr
    for (int i = arr.length - 1; i >= 0; i--) {
      while (!s.isEmpty() && arr[i] <= arr[s.peek()]) {
        s.pop();
      }
      if (s.isEmpty()) {
        nsr[i] = arr.length;
      } else {
        nsr[i] = s.peek();
      }
      s.push(i);
    }

    s = new Stack<>();
    //nsl

    for (int i = 0; i < arr.length; i++) {
      while (!s.isEmpty() && arr[i] <= arr[s.peek()]) {
        s.pop();
      }
      if (s.isEmpty()) {
        nsl[i] = -1;
      } else {
        nsl[i] = s.peek();
      }
      s.push(i);
    }

    int maxarea = 0;
    for (int i = 0; i < arr.length; i++) {
      int height = arr[i];
      int width = nsr[i] - nsl[i] - 1;
      int currArea = height * width;
      maxarea = Math.max(currArea, maxarea);
    }
    System.out.println("maxarea = " + maxarea);
  }

  public static void main(String[] args) {
    int arr[] = { 4, 2 };
    MAXAREA(arr);
  }
}
