package STRINGS;

import java.util.*;

public class Replace {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a new string ");
    String str = sc.nextLine();
    System.out.println("enter a substring to be replaced ");
    String replacestring = sc.nextLine();
    System.out.println("enter a new String");
    String newstring = sc.nextLine();
    String string = str.replace(replacestring, newstring);
    System.out.println("final string : " + string);
  }
}
