package GREEDY;

import java.util.*;

public class FRACTIONALKNAPSACK {

  public static void main(String[] args) {
    int val[] = { 60, 100, 120 };
    int weight[] = { 10, 20, 30 };
    int W = 50;

    int capacity = W;
    // for sorting double because we are also taking the fraction value
    double ratio[][] = new double[val.length][2];
    for (int i = 0; i < val.length; i++) {
      ratio[i][0] = i; //index value
      ratio[i][1] = val[i] / (double) weight[i];
    }

    // taking the final value for the answer
    int finalVal = 0;
    Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1])); //here the array is sorted in ascending order
    for (int i = val.length - 1; i >= 0; i--) {
      int idx = (int) ratio[i][0];
      //   case1: where we are taking the whole value
      if (capacity >= weight[idx]) {
        finalVal += val[idx];
        capacity -= weight[idx];
      }
      //   case 2: fractional part
      else {
        finalVal += (ratio[i][1] * capacity);
        capacity = 0;
        break;
      }
    }
    System.out.println("the final capacity : " + finalVal);
  }
}
