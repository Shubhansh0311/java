package GREEDY;

import java.util.*;

public class MAXactivityUNSORTED {

  public static void main(String[] args) {
    int start[] = { 1, 3, 0, 5, 8, 5 };
    int end[] = { 2, 4, 6, 7, 9, 9 };

    // array list for storing the ans activities
    ArrayList<Integer> list = new ArrayList<>();
    // to perform sorting
    int activities[][] = new int[start.length][3];
    // three columns index|start|end

    // for assignning the index
    for (int i = 0; i < start.length; i++) {
      activities[i][0] = i;
      activities[i][1] = start[i];
      activities[i][2] = end[i];
    }

    // performing sorting

    int maxact = 0;
    Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
    list.add(activities[0][0]);
    int endTime = activities[0][2];
    maxact++;
    // now the arrray is sorted

    for (int i = 1; i < start.length; i++) {
      if (activities[i][1] >= endTime) {
        list.add(i);
        maxact++;
        endTime = activities[i][2];
      }
    }
    System.out.println("MaxAct that can be performed : " + maxact);
    for (int i = 0; i < list.size(); i++) {
      System.out.print("A" + list.get(i) + " ");
    }
  }
}
