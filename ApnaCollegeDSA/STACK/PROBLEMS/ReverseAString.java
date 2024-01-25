package STACK.PROBLEMS;

import java.nio.charset.StandardCharsets;
import java.util.Stack;

class ReverseAString {

  public static String ReverseString(String str) {
    Stack<Character> s = new Stack<>();

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);

      s.push(ch);
    }
    str = "";
    while (!s.isEmpty()) {
      char c = s.pop();
      str += c;
    }

    return str;
  }

  public static void main(String[] args) {
    String str = "shubhansh";
    String ans = ReverseString(str);
    System.out.println(ans);
  }
}
