import java.lang.Math;
import java.util.*;
import javax.swing.event.ListDataEvent;

class ArrayLists {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    list.add(1);
    list.add(8);
    list.add(6);
    list.add(2);
    list.add(5);
    list.add(4);
    list.add(8);
    list.add(3);
    list.add(7);

    // System.out.println(list);
    // list.sort(null);
    // System.out.println(list);

    // int arr[] = { 1, 2, 3, 4, 5, 7, 6 };
    // for (int i = 1; i < arr.length; i++) {
    //   for (int j = 1; j < arr.length; j++) {
    //     // System.out.print(arr[i] + "," + arr[j]);
    //     System.out.print("(" + arr[i] + "," + arr[j] + ")");
    //   }
    //   System.out.println();
    // }

    // ----------------------------------------------------------------------------------->   n^2 complexity

    // int max = Integer.MIN_VALUE;
    // for (int i = 0; i < list.size(); i++) {
    //   for (int j =i+ 1; j < list.size(); j++) {
    //     int height = Math.min(list.get(i), list.get(j));
    //     int width = j - i;
    //     int area = height * width;
    //     if (max < area) {
    //       max = area;
    //     }
    //     // System.out.print("(" + list.get(i) + "," + list.get(j) + ")");
    //   }
    // }
    // System.out.println(max);

    // ----------------------------------------------------------------------------------->   n complexity

    int left = 0;
    int right = list.size() - 1;
    int max = Integer.MIN_VALUE;
    while (left < right) {
      int width = right - left;
      int height = Math.min(list.get(left), list.get(right));
      int area = height * width;
      if (max < area) {
        max = area;
      }
      if (list.get(left) < list.get(right)) {
        left++;
      } else {
        right--;
      }
    }
    System.out.println(max);
  }
}
