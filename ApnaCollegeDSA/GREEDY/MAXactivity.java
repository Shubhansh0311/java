package GREEDY;

// here the activity are sorted
import java.util.ArrayList;

public class MAXactivity {

  public static void main(String[] args) {
    int start[] = { 10, 12, 20 };
    int end[] = { 20, 20, 30 };
    // taking arrray list to store the ans
    ArrayList<Integer> ans = new ArrayList<>();

    int maxact = 0;
    int endtime = 0;

    // adding the first Activity
    ans.add(0);

    endtime = end[0];
    maxact++;
    for (int i = 1; i < start.length; i++) {
      if (start[i] >= endtime) {
        ans.add(i);
        maxact++;
        endtime = end[i];
      }
    }
    // printing the result
    System.out.println(
      "The max activity that can be performed at a time  : " + maxact
    );
    for (int i = 0; i < ans.size(); i++) {
      System.out.print("A" + ans.get(i) + " ");
    }
  }
}
