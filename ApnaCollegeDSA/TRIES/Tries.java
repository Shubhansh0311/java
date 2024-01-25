package TRIES;

class Tries {

  static Node root = new Node();

  static class Node {

    Node children[] = new Node[26];
    boolean eow = false;

    Node() {
      for (int i = 0; i < 26; i++) {
        children[i] = null;
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

      curr = curr.children[idx];
    }
    curr.eow = true;
  }

  //   search a word in a tree
  public static boolean search(String key) {
    Node curr = root;
    for (int i = 0; i < key.length(); i++) {
      int idx = key.charAt(i) - 'a';
      if (curr.children[idx] == null) {
        return false;
      }
      curr = curr.children[idx];
    }
    return curr.eow == true;
  }

  public static void main(String[] args) {
    String arr[] = { "any", "thee", "their", "there", "an" };

    // for inserting
    for (int i = 0; i < arr.length; i++) {
      insert(arr[i]);
    }

    // searching a word
    System.out.println(search("any"));
  }
}
