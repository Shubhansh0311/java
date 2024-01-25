package STRINGS;

import java.util.*;

public class FirstNonRepeatingCharacter {

  public static char repeating(String str) {
    LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (map.containsKey(ch)) {
        map.put(ch, map.get(ch) + 1);
      } else {
        map.put(ch, map.getOrDefault(ch, 0) + 1);
      }
    }
    for (Character key : map.keySet()) {
      if (map.get(key) == 1) {
        return key;
      }
    }
    return '!';
  }

  public static void main(String[] args) {
    String str = "prepeinsta";
    System.out.println(repeating(str));
  }
}
