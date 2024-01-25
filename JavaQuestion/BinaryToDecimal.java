public class BinaryToDecimal {

  public static int BtoDecimal(int n) {
    int pow = 0, decNum = 0;
    while (n != 0) {
      int lastdigit = n % 10;
      decNum += lastdigit * (int) Math.pow(2, pow);
      pow++;
      n /= 10;
    }
    return decNum;
  }

  public static void main(String[] args) {
    int n = 101;
    System.out.println("decimal of " + n + " is equals to " + BtoDecimal(n));
  }
}
