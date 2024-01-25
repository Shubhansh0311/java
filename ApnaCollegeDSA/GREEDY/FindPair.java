package GREEDY;

import java.util.*;

// O(nlogn)
public class FindPair {

  public static void main(String[] args) {
    int pairs[][] = {
      { 5, 24 },
      { 39, 60 },
      { 5, 28 },
      { 27, 40 },
      { 50, 90 },
    };

    Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
    int nPairs = 1;
    int lastpair = pairs[0][1];
    for (int i = 1; i < pairs.length; i++) {
      if (pairs[i][0] >= lastpair) {
        nPairs++;
        lastpair = pairs[i][1];
      }
    }
    System.out.println("The Maximum No of chains that can be formed " + nPairs);
  }
}
