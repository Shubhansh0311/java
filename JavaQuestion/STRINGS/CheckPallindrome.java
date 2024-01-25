package STRINGS;

public class CheckPallindrome {

  public static boolean isPallindrome(String str, int n) {
    for (int i = 0; i < n; i++) {
      if (str.charAt(i) != str.charAt(n - i)) {
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {
    String str = "shubhansh";
    int n = str.length() - 1;
    System.out.println(isPallindrome(str, n));

    // print in reverseOrder
    for(int i=str.length()-1;i>=0;i--){
        System.out.print(str.charAt(i));
    }
  }
}
