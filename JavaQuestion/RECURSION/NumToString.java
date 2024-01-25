package RECURSION;

public class NumToString {

  public static void printTOstring(int num) {
    if (num == 0) {
      return;
    }
    String arr[] = {
      "zero",
      "one",
      "two",
      "three",
      "four",
      "five",
      "six",
      "seven",
      "eight",
      "nine",
    };
    int lastdigit = num % 10;
    printTOstring(num / 10);
    System.out.print(arr[lastdigit] + " ");
  }

  public static void main(String[] args) {
    int num = 1245;
    printTOstring(num);
  }
}
