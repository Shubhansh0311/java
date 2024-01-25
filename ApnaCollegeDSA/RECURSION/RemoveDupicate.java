package RECURSION;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDupicate {

  public static void main(String[] args) {
    String str = "appnacollege";
    LinkedHashSet<Character> set = new LinkedHashSet<>();
    for (int i = 0; i < str.length(); i++) {
      set.add(str.charAt(i));
    }
    str = "";
    for (Character ch : set) {
      str += ch;
    }
    // System.out.println(str);
    boolean map[] = new boolean[26];
    Removedupicate(str, "", map, 0);
  }

  //   using recursion

  public static void Removedupicate(
    String str,
    String newstr,
    boolean map[],
    int i
  ) {
    if (i == str.length()) {
      System.out.println(newstr);
      return;
    }
    int idx = str.charAt(i) - 'a';
    if (map[idx] == true) {
      Removedupicate(str, newstr, map, i + 1);
    } else {
      map[idx] = true;
      Removedupicate(str, newstr += (str.charAt(i)), map, i+1
      );
    }
  }
}
