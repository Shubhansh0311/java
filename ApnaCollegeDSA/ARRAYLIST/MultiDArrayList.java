package ARRAYLIST;

import java.util.ArrayList;

public class MultiDArrayList {

  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
    ArrayList<Integer> list1 = new ArrayList<>();
    list1.add(1);
    list1.add(2);
    list1.add(3);
    list1.add(4);
    list1.add(5);
    mainList.add(list1);
    ArrayList<Integer> list2 = new ArrayList<>();
    list2.add(11);
    list2.add(12);
    list2.add(13);
    list2.add(14);
    list2.add(15);
    mainList.add(list2);
    System.out.println(mainList);
    for (int i = 0; i < mainList.size(); i++) {
      ArrayList<Integer> currList = mainList.get(i);
      for (int j = 0; j < currList.size(); j++) {
        System.out.print(currList.get(j) + " ");
      }
      System.out.println();
    }
  }
}
