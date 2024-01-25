package RECURSION;

import java.lang.Math;
import java.util.*;

public class CountNumOfDigit {

  static int digit = 0;

  public static int countDigit(int a) {
    if (a == 0) {
      return 1;
    }
    countDigit(a / 10);
    digit++;
    return digit;
  }

  public static void printsubset(String str) {
    for (int i = 0; i <= str.length(); i++) {
      char c = str.charAt(i);
      System.out.println(c + str.substring(0, i));
    }
  }

  public static void main(String[] args) {
    int a = 123;
    // System.out.println(countDigit(a));
    // String n =;
    printsubset(Integer.toString(a));
  }
}
