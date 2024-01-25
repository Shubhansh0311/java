package STRINGS;

import java.util.*;

public class FrequencyOfCharacter {

  public static void countFrequency(String str) {
    LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      map.put(ch, map.getOrDefault(ch, 0) + 1);
    }
    System.out.print(map);
  }

  public static void main(String[] args) {
    String str = "prepinsta";
    countFrequency(str);
  }
}
