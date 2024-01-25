public class buyORSELL {

  public static void main(String[] args) {
    int prices[] = { 7, 1, 2, 3, 6, 5 };
    int maxprofit = 0;
    int buyprice = Integer.MAX_VALUE;
    System.out.println(buyprice);
    for (int i = 0; i < prices.length; i++) {
      if (prices[i] > buyprice) {
        int profit = prices[i] - buyprice;
        maxprofit = Math.max(maxprofit, profit);
      } else {
        buyprice = prices[i];
      }
    }
    System.out.println(maxprofit);
  }
}
