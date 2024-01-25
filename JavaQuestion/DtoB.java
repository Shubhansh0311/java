public class DtoB {

  public static int decToB(int n) {
    int ans = 0;
    int pow = 0;
    while (n > 0) {
      int rem = n % 2;
      ans = ans + (rem *(int)(Math.pow(10,pow)));
      pow++;
      n /= 2;
    }

    return ans;
  }

  public static void main(String[] args) {
    int num = 5;
    System.out.println("binary of " + num + " is " + decToB(num));
  }
}
