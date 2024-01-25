package GREEDY;

import java.util.*;

public class IndianCoin {

  public static void main(String[] args) {
    Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 200 };

    Arrays.sort(coins, Comparator.reverseOrder());
    int nCoins = 0;
    // arraylist to store denominations
    ArrayList<Integer> list = new ArrayList<>();
    int amt = 1509;
    for (int i = 0; i < coins.length; i++) {
      if (coins[i] <= amt) {
        while (coins[i] <= amt) {
          list.add(coins[i]);
          nCoins++;
          amt -= coins[i];
        }
      }
    }
    System.out.println("Minimum coins required : " + nCoins);
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + " ");
    }
  }
}
