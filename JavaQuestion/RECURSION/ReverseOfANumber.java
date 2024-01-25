package RECURSION;

public class ReverseOfANumber {

  public static void reverseTheNumber(int n) {
   
    int reverse = 0;
    while (n != 0) {
      int mod = n % 10;
      reverse = reverse*10+mod;
      n /= 10;
    }
    // int num = n % 10;
    System.out.print(reverse);
    // reverseTheNumber(n / 10);
  }

  public static void main(String[] args) {
    int n = 123456;
    reverseTheNumber(n);
    System.out.print("\n" + n);
  }
}
