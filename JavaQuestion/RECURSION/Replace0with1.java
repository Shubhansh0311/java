package RECURSION;

import java.util.*;

public class Replace0with1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter any number");
    int i = sc.nextInt();

    String str = Integer.toString(i);
    String newstr = "";
    for (i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '0') {
        newstr += "1";
      } else {
        newstr += str.charAt(i);
      }
    }

    // System.out.println(str);
    System.out.println(newstr);
  }
}
