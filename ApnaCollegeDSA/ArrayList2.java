//to check whether the pair sum is equal to the target or not

import java.util.ArrayList;

public class ArrayList2 {

  public static boolean checkSum(ArrayList<Integer> list, int target) {
    // --------------------------------------------------------------------------------------complexity n^2

    // for (int i = 0; i < list.size(); i++) {
    //   for (int j = i + 1; j < list.size(); j++) {
    //     if (list.get(i) + list.get(j) == target) {
    //       return true;
    //     }
    //   }
    // }

    int left = 0;
    int right = list.size() - 1;
    while (left < right) {
      if (list.get(left) + list.get(right) == target) {
        return true;
      } else if (list.get(left) + list.get(right) < target) {
        left++;
      } else {
        right--;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    int target = 5;
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    System.out.println(checkSum(list, target));
  }
}
