package QUEUE;

import QUEUE.CircularQUEUE.Queue;
import java.util.*;
import javax.management.Query;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class FirstNonRepeatingCharInAStreamOfCharacter {

  public static void nonRepeating(String str) {
    int freq[] = new int[26]; //array to track the frequency of the character
    java.util.Queue<Character> q = new LinkedList<>();


q.size();



    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      q.add(ch);
      freq[ch - 'a']++; //increasing the frequency of the character

      while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) { //remove the character whose frequency is greater than 1
        q.remove();
      }
      if (q.isEmpty()) {
        System.out.print(-1 + " ");
      } else {
        System.out.print(q.peek() + " ");//if frequency<1 and queue is non empty 
      }
    }
    System.out.println();
  }

  public static void main(String[] args) {
    String str = "aabccxb";
    nonRepeating(str);
  }
}
