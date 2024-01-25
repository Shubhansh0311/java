package ARRAYLIST;

import java.util.ArrayList;

public class PairSum_2 {

  // complexity==O(n)

  public static boolean Pairsum_2(ArrayList<Integer> arr, int target) {
    int bp = -1;

    // breaking point
    // point where value of i+1 >i
    for (int i = 0; i < arr.size(); i++) {
      if (arr.get(i) > arr.get(i + 1)) {
        bp = i;
        break;
      }
    }
    // then looping
    int lp = bp + 1; //small index will be after the breaking point
    int rp = bp; // rp will be the greatest element which is the breaking point
    int n = arr.size();
    while (lp != rp) {
      // case1
      if (arr.get(rp) + arr.get(lp) == target) {
        return true;
      }
      //   case2
      if (arr.get(rp) + arr.get(lp) < target) {
        lp = (lp + 1) % n;
      } else {
        rp = (rp - 1 + n) % n;
      }
    }

    return false;
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(11);
    list.add(15);
    list.add(6);
    list.add(8);
    list.add(9);
    list.add(10);
    int target = 17;
    System.out.println(Pairsum_2(list, target));
  }
}
