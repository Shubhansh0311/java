package HASHMAP;

import java.nio.MappedByteBuffer;
import java.util.HashMap;
import java.util.TreeMap;
import javax.sql.rowset.spi.SyncResolver;
import javax.swing.text.AbstractDocument.LeafElement;

public class HashMapAnagram {

  public static boolean isAnagram(String s, String t) {
    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      map.put(ch, map.getOrDefault(ch, 0) + 1);
    }
    if (s.length() != t.length()) {
      return false;
    } else {
      for (int i = 0; i < t.length(); i++) {
        char ch = t.charAt(i);
        if (map.get(ch) != null) {
          if (map.get(ch) == 1) {
            map.remove(ch);
          } else {
            map.put(ch,map.get(ch)-1);
          }
        }
      }
    }
    return map.isEmpty();
  }

  public static void main(String[] args) {
    boolean ans=isAnagram("race", "RACE");
  }
}
