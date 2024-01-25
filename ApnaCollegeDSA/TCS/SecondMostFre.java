package TCS;

import java.security.spec.MGF1ParameterSpec;
import java.util.*;
import java.util.HashMap;
import java.util.HashSet;

public class SecondMostFre {

  public static char findSecondMostFrequent(String str) {
    if (str.length() == 0) {
      return '\0';
    }
    HashMap<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      map.put(c, map.getOrDefault(c, 0) + 1);
    }
    char MostFrequent = '\0';
    char secondMostFrequent = '\0';
    for (Character ch : map.keySet()) {
      int fre = map.get(ch);
      if (MostFrequent == '\0' || fre > map.get(MostFrequent)) {
        secondMostFrequent = MostFrequent;
        MostFrequent = ch;
      } else if (
        secondMostFrequent == '\0' || fre > map.get(secondMostFrequent)
      ) {
        secondMostFrequent = ch;
      }
    }
    return (char) secondMostFrequent;
  }

  public static void main(String[] args) {
    String str = "aabbd";
    Set<Character> set = new HashSet<>();
    for (int i = 0; i < str.length(); i++) {
      set.add(str.charAt(i));
    }
    char secondMostFrequent = findSecondMostFrequent(str);

    if (set.size() == str.length()) {
      System.out.println("no repeated character");
    } else {
      System.out.println("Second most frequent element: " + secondMostFrequent);
    }
  }
}
