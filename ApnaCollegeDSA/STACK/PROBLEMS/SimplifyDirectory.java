package STACK.PROBLEMS;

import java.util.Stack;

public class SimplifyDirectory {

  public static void main(String[] args) {
    String str = "/apna/";
    String res = simplify(str);
    System.out.println(res);
  }

  public static String simplify(String str) {
    Stack<String> st = new Stack<>();
    String res = "";
    res += "/";

    for (int i = 0; i < str.length(); i++) {
      String dir = "";
      while (i < str.length() && res == "/") {
        i++;
      }
      while (i < str.length() && res != "/") {
        dir += str.charAt(i);
        i++;
      }
      if (dir.equals("..") == true) {
        if (!st.isEmpty()) {
          st.pop();
        } else if (dir.equals(".") == true) {
          continue;
        } else if (dir.length() != 0) {
          st.push(dir);
        }
        Stack<String> st1 = new Stack<>();
        while (!st.isEmpty()) {
          st1.push(st.pop());
        }
        while (!st1.isEmpty()) {
          if (st1.size() != 1) {
            res += (st1.pop() + "/");
          } else {
            res += st1.pop();
          }
        }
      }
    }
    return res;
  }
}
