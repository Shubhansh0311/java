package TCS;

import java.util.HashSet;
import java.util.Scanner;

class STRingCHarRemove {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = "talent";
    HashSet<Character> set = new HashSet<>();
    String c = "";
    // for (int i = 0; i < str.length(); i++) {
    //   s.add(str.charAt(i));
    // }
    String str1 = "ten";

    for (int i = 0; i < str.length(); i++) {
      set.add(str.charAt(i));
    }

    for (int i = 0; i < str1.length(); i++) {
      set.remove(str1.charAt(i));
    }

    for (Character ch : set) {
      c += ch;
    }
    System.out.println(c);
  }
}
