package RECURSION;

public class LengthOfTheStringWithLengthFunciton {

  public static int getHCF(int a, int b) {
    return b == 0 ? a : getHCF(b, a % b);
  }

  public static void main(String[] args) {
    String str = "shubhansh";
    char ch[] = str.toCharArray();
    int i = 0;
    for (char c : ch) {
      i++;
    }
    System.out.println(i);
    int a = 12, b = 48;
    System.out.println(getHCF(a, b));
  }
}
