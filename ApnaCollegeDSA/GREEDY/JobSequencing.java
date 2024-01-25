package GREEDY;

import java.util.*;

public class JobSequencing {

  static class Job {

    int deadline;
    int profit;
    int id;

    Job(int id, int deadline, int profit) {
      this.id = id;
      this.profit = profit;
      this.deadline = deadline;
    }
  }

  public static void main(String[] args) {
    Integer jobs[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };
    ArrayList<Job> list = new ArrayList<>();
    int time = 0;
    for (int i = 0; i < jobs.length; i++) {
      list.add(new Job(i, jobs[i][0], jobs[i][1]));
    }
    Collections.sort(list, (a, b) -> b.profit - a.profit);
    ArrayList<Integer> ans = new ArrayList<>();
    int maxProfit = 0;
    for (int i = 0; i < list.size(); i++) {
      Job j = list.get(i);
      if (j.deadline > time) {
        ans.add(j.id);
        maxProfit += j.profit;
        time++;
      }
    }
    for (int i = 0; i < ans.size(); i++) {
      System.out.print(ans.get(i) + " ");
    }
    System.out.println("maxprofit : " + maxProfit);
  }
}
