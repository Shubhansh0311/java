package TRIES;

import java.util.HashMap;
import java.util.TreeMap;

public class LongestCommonPrefix {

  static Node root = new Node();

  static class Node {

    int freq;
    Node children[] = new Node[26];
    boolean eow = false;

    Node() {
      for (int i = 0; i < 26; i++) {
        children[i] = null;
        freq = 0;
      }
    }
  }

  //   insertion O(L)  L:length of the word

  public static void insert(String word) {
    Node curr = root;
    for (int i = 0; i < word.length(); i++) {
      int idx = word.charAt(i) - 'a';
      if (curr.children[idx] == null) {
        curr.children[idx] = new Node();
      }
        curr.freq++;
      

      curr = curr.children[idx];
    }
    curr.eow = true;
  }

  public static String get(String str) {
    Node curr = root;
    String pref = "";
    for (int i = 0; i < str.length(); i++) {
      int idx = str.charAt(i) - 'a';
      if (curr.freq == 1) {
        break;
      }
      pref += str.charAt(i);
      curr = curr.children[idx];
    }
    return pref;
  }

  public static void main(String[] args) {
    String arr[] = { "zebra", "dog", "duck", "dove" };

    // for inserting
    for (int i = 0; i < arr.length; i++) {
      insert(arr[i]);
    }
    // searching a word
    String[] newArr = new String[arr.length];
    for (int i = 0; i < arr.length; i++) {
      newArr[i] = get(arr[i]);
    }
System.out.print("[");
    for (int i = 0; i < newArr.length; i++) {
        System.out.print(newArr[i]+",");
    }
    System.out.println("]");
  }

}
