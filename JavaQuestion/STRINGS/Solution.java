package STRINGS;

import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    System.out.println("enter any character");
    Scanner sc = new Scanner((System.in));
    char c = sc.next().charAt(0);
    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
      System.out.println(c + " is lower case vowel");
    }
    if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
      System.out.println(c + " is upper case vowel");
    } else if ((int) c > 48 && (int) c < 57) {
      System.out.println(c + " is a number ");
    } else {
      System.out.println(c + " is a consonant");
    }
    System.out.println((int)c);
  }
}
