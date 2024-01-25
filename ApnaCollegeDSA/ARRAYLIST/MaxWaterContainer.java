package ARRAYLIST;

import javax.swing.event.InternalFrameAdapter;

public class MaxWaterContainer {

  public static void main(String[] args) {
    int arr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7};
    int max = Integer.MIN_VALUE;
  
   for (int i = 0; i < arr.length; i++) {
     for (int j = i + 1; j < arr.length; j++) {
      int width = j - i;
      int height = Math.min(arr[j], arr[i]);

      int area = width * height;
      max = Math.max(max, area);
    }
   }
    System.out.println(max);
  }
}
