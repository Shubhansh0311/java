package STRINGS;

public class P {

  public static boolean isPallindrome(String str) {
    int n = str.length()-1;
    for (int i = 0; i <n; i++) {
      if (str.charAt(i) != str.charAt(n - i)) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String str = "ma#nymn#am";
    System.out.println(isPallindrome(str));
  }
}
