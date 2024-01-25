package STACK.PROBLEMS;

import java.util.Stack;
import javax.swing.text.StyledEditorKit.BoldAction;

class DuplicateParenthesis {

  public static boolean isDuplicate(String str) {
    Stack<Character> s = new Stack<>();
    for (int i = 0; i < str.length(); i++) {
      // closing
      char ch = str.charAt(i);
      if (ch == ')') {
        // looping until we find the opening pair of the brackets
        int count = 0;
        while (s.pop() != '(') {
          //   s.pop();
          count++;
        }
        if (count < 1) {
          return true; //duplicate
        }
        //adding the opening into the stack
      } else {
        s.push(ch);
      }
    }
    return false;
  }

  public static void main(String[] args) {
    String str = "((a+b)+c)";
    System.out.println(isDuplicate(str));
  }
}
