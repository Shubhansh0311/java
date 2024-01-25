package STACK.PROBLEMS;

import java.util.Stack;
import javax.print.StreamPrintService;

public class SpanStock {

  public static void StocksSpan(int stock[], int span[]) {
    Stack<Integer> s = new Stack<>();
    span[0] = 1;
    s.push(0);
    for (int i = 1; i < stock.length; i++) {
      int currPrice = stock[i];

      while (!s.isEmpty() && currPrice >= stock[s.peek()]) {
        s.pop();
      }
      if (s.isEmpty()) {
        span[i] = i + 1;
      } else {
        span[i] = i - s.peek();
      }
      s.push(i);
    }
  }

  public static void main(String[] args) {
    int stocks[] = { 100, 80, 60, 70, 60, 85, 100 };
    int span[] = new int[stocks.length];
    StocksSpan(stocks, span);
    for (int i = 0; i < span.length; i++) {
      System.out.print(span[i] + " a");
    }
  }
}
