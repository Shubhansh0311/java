package STACK.PROBLEMS;

import java.util.Stack;

public class ReverseAStack {

  public static void PushAtBottom(Stack<Integer> s, int data) {
    if (s.isEmpty()) {
      s.push(data);
      return;
    }
    int t = s.pop();
    PushAtBottom(s, data);
    s.push(t);
  }

  public static void reveseStach(Stack<Integer> s) {
    if (s.isEmpty()) {
      return;
    }
    int t = s.peek();
s.pop();
    reveseStach(s);
    PushAtBottom(s, t);
  }

  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);

    // while (!s.isEmpty()) {
    //   System.out.println(s.pop());
    // }
    reveseStach(s);
    System.out.println("REVERSE STACK");
    while (!s.isEmpty()) {
      System.out.println(s.pop());
    }
  }
}
