package STRINGS;

import java.util.Arrays;

public class CapitalizeFirstAndLastCharacterOfAstring {

  public static String Capitalize(String str) {
    String newstr = "";
    int i;
    if (str.charAt(0) == ' ') {
      int fc = str.charAt(1) - 32;
      newstr += (char) fc;
      i = 2;
    } else {
      int fc = str.charAt(0) - 32;
      newstr += (char) fc;
      i = 1;
    }
    for (; i < str.length() - 1; i++) {
      if (str.charAt(i + 1) == ' ') {
        int ch = str.charAt(i) - 32;
        newstr += (char) ch;
      } else if (str.charAt(i) == ' ') {
        newstr += str.charAt(i);
        int c = str.charAt(i + 1) - 32;
        newstr += (char) c;
        i++;
      } else {
        newstr += str.charAt(i);
      }
    }
    int lc = str.charAt(str.length() - 1) - 32;
    newstr += (char) lc;
    return newstr;
  }

  public static void main(String[] args) {
    String str = "shubhansh agrawal";
    System.out.println(Capitalize(str));
  }
}
