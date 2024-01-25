import java.util.*;
import java.util.Arrays;

public class JobSequencing {

  static class Jobs {

    int deadline;
    int id;
    int profit;

    Jobs(int id, int deadline, int profit) {
      this.id = id;
      this.profit = profit;
      this.deadline = deadline;
    }
  }

  public static void main(String[] args) {
    int jobs[][] = { { 4, 20 }, { 1, 10 }, { 1, 30 }, { 1, 40 } };

    ArrayList<Jobs> list = new ArrayList<>();
    ArrayList<Integer> ans = new ArrayList<>();
    for (int i = 0; i < jobs.length; i++) {
      // to store the job we need an
      list.add(new Jobs(i, jobs[i][0], jobs[i][1]));
    }
    int profit = 0;
    int time = 0;
    Collections.sort(list, (a, b) -> b.profit - a.profit);
    for (int i = 0; i < list.size(); i++) {
      Jobs curr = list.get(i);
      if (curr.deadline > time) {
        ans.add(curr.id);
        time++;
        profit += curr.profit;
      }
    }
    for (int i = 0; i < ans.size(); i++) {
      System.out.print("J" + ans.get(i) + " ");
    }
    System.out.println();
    System.out.println("Maxprofit : " + profit);
  }
}
