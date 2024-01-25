// import LL.Node;
import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapCode {

  static class HashMap<K, V> { //genreric when we dont have a fixed type of key value pair

    private class Node {

      K key;
      V value;

      public Node(K key, V value) {
        this.key = key;
        this.value = value;
      }
    }

    private int n;
    private int N;
    private LinkedList<Node> buckets[]; //N=buckets.length array of linkedlist

    @SuppressWarnings("unchecked")
    public HashMap() {
      this.N = 4; //n=size
      this.buckets = new LinkedList[4];
      for (int i = 0; i < 4; i++) {
        this.buckets[i] = new LinkedList<>();
      }
    }

    // implementing put function
    public int hashFunction(K key) {
      int hc = key.hashCode(); //return the hash code  value for the object and perform hashing
      return Math.abs(hc) % N;
    }

    public int SearchInLL(K key, int bi) {
      int di = 0; //data index
      LinkedList<Node> ll = buckets[bi];
      for (int i = 0; i < ll.size(); i++) {
        Node node = ll.get(i);
        if (node.key == key) {
          return di;
        }
        di++;
      }
      return -1;
    }

    // to remove warning
    @SuppressWarnings("unchecked")
    //to optimize
    private void rehash() {
      LinkedList<Node> oldBuck[] = buckets;
      buckets = new LinkedList[N * 2];
      N = 2 * N;
      for (int i = 0; i < buckets.length; i++) {
        buckets[i] = new LinkedList<>();

        //nodes add in bucket
        for (int j = 0; j < oldBuck.length; j++) {
          LinkedList<Node> ll = oldBuck[i];
          for (int k = 0; k < oldBuck.length; k++) {
            Node node = ll.remove();
            put(node.key, node.value);
          }
        }
      }
    }

    public void put(K key, V value) {
      int bi = hashFunction(key);
      int di = SearchInLL(key, bi);
      if (di != -1) {
        Node node = buckets[bi].get(di);
        node.value = value;
      } else {
        buckets[bi].add(new Node(key, value));
        n++;
      }
      double lambda = (double) n / N;
      if (lambda > 2.0) {
        rehash();
      }
    }

    public boolean containsKey(K key) {
      int bi = hashFunction(key);
      int di = SearchInLL(key, bi);
      if (di != -1) {
        return true;
      } else {
        return false;
      }
    }

    public V remove(K key) {
      int bi = hashFunction(key);
      int di = SearchInLL(key, bi);
      if (di != -1) {
        Node node = buckets[bi].remove(di);
        n--;
        return node.value;
      } else {
        return null;
      }
    }

    public V get(K key) {
      int bi = hashFunction(key);
      int di = SearchInLL(key, bi);
      if (di != -1) {
        Node node = buckets[bi].get(di);
        return node.value;
      } else {
        return null;
      }
    }

    public ArrayList<K> keySet() {
      ArrayList<K> keys = new ArrayList<>();
      for (int i = 0; i < buckets.length; i++) {
        LinkedList<Node> ll = buckets[i];
        for (Node node : ll) {
          keys.add(node.key);
        }
      }
      return keys;
    }

    public boolean isEmpty() {
      return n == 0;
    }
  }

  public static void main(String[] args) {
    HashMap<String, Integer> hm = new HashMap<>();
    hm.put("India", 120);
    hm.put("China", 110);
    hm.put("UK", 190);
    hm.put("japan", 20);
    ArrayList<String> keys = hm.keySet();
    for (String key : keys) {
      System.out.println("key=" + key + " " + "value=" + hm.get(key));
    }
    System.out.println(hm.get("India"));
    System.out.println(hm.remove("India"));

    System.out.println(hm.get("India"));
    System.out.println(hm.isEmpty());
  }
}
