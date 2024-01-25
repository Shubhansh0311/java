package HASHMAP;

import java.util.HashMap;
import java.util.TreeMap;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class HashMapArrayIndexwhoseSumEqualToGivenNum {

  public static int[] findIndex(int arr[], int target) {
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
      int diff = target - arr[i];
      if (map.containsKey(diff)) {
        return new int[] { i, map.get(diff) };
      }
      map.put(arr[i], i);
    }
    return new int[] {};
  }

  public static void main(String[] args) {
    int arr[] = { 2, 7, 11, 15 };
    int n = 9;

    // for(int i=)
    int newarr[]=findIndex(arr, 32);
    for(int i=0;i<newarr.length;i++){
      System.out.print(newarr[i]+" ");
    }

    String str = "eeeemmrt";
    TreeMap<Character, Integer> hm = new TreeMap<>();
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);

      hm.put(ch, hm.getOrDefault(ch, 0) + 1);
    }
    System.out.println(hm);
    

    for(Character c:hm.keySet()){
     
      System.out.println(hm.get(c));
    }
  }

}
