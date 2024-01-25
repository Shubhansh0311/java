package TCS;

import java.util.*;

public class Panagram {

  public static boolean checkPanagram(String str) {
    boolean arr[] = new boolean[26];
    int index = 0;
    for (int i = 0; i < str.length(); i++) {
      if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
        index = str.charAt(i) - 'A';
      } else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
        index = str.charAt(i) - 'a';
      }

      arr[index] = true;
    }
    for (int i = 0; i < 26; i++) {
      if (arr[i] == false) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String str = "The quick brown fox jumps over the lazy dog";

    if (checkPanagram(str)) {
      System.out.println("it's a panagram");
    } else {
      System.out.println("Not a a panagram");
    }
  }
}
