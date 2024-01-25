package STACK.PROBLEMS;

import java.util.Stack;

public class ValidParenthesis {

  public static boolean validParenthesis(String str) {
    Stack<Character> s = new Stack<>();
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (ch == '(' || ch == '{' || ch == '[') {
        s.push(ch);
      } else {
        if (s.isEmpty()) {
          return false;
        }
        if (
          s.peek() == '(' &&
          ch == ')' ||
          s.peek() == '[' &&
          ch == ']' ||
          s.peek() == '{' &&
          ch == '}'
        ) {
          s.pop();
        } else {
          return false;
        }
      }
    }
    if (s.isEmpty()) {
      return true;
    } else {
      return false;
    }
    // OR

    // return s.isEmpty();;
  }

  public static void main(String[] args) {
    String str = "{}{}{}[]{{({})}}";
    Boolean ans = validParenthesis(str);
    System.out.println(ans);
String newstr="  ab c";
System.out.println(newstr.trim());
   
  }
}
