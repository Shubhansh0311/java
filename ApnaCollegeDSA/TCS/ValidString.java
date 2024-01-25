package TCS;

// : The output will be a positive or negative integer based on number of ‘*’ and ‘#’ in the input string.

// (*>#): positive integer
// (#>*): negative integer
// (#=*): 0

public class ValidString {

  public static void main(String[] args) {
    String str = "####***";
    int countH = 0;
    int countS = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '*') {
        countS++;
      } else {
        countH++;
      }
    }
    if (countH > countS) {
      System.out.println(-1);
    } else if (countH < countS) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
  }
}
