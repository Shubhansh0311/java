class buyORSELLprofitAfterSecondSell {

  public static int AfterTwoSell(int prices[]) {
    int firstsell = 0;
    int secondsell = 0;
    int firstBuy = Integer.MIN_VALUE;
    int secondBuy = Integer.MIN_VALUE;
    for (int i = 0; i < prices.length; i++) {
      firstBuy = Math.max(firstBuy, -prices[i]);
      firstsell = Math.max(firstsell, firstBuy + prices[i]);

      secondBuy = Math.max(secondBuy, firstsell - prices[i]);
      secondsell = Math.max(firstsell, secondBuy + prices[i]);
    }
    return secondsell;
  }

  public static void main(String[] args) {
    int prices[] = { 2, 30, 15, 10, 8, 25, 80 };
    System.out.println("profit after two buy or sell " + AfterTwoSell(prices));
  }
}
