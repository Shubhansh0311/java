package RECURSION;

public class PowerOfANumber {

  public static int CalculatePower(int base, int power) {
    if (power == 0) {
      return 1;
    }
    return  base* CalculatePower(base, power - 1);
  }

  public static void main(String[] args) {
    int base = 3;
    int power = 0;
    System.out.println(CalculatePower(base, power));
  }
}
