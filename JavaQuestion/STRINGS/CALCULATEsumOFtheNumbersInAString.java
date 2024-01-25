package STRINGS;

public class CALCULATEsumOFtheNumbersInAString {

  public static int Sum(String str) {
    int ans = 0;
    for (int i = 0; i < str.length(); i++) {
      int ch = str.charAt(i);
      if (ch >= 48 && ch <= 57) {
        //  👉ans+=ch-'0';//most important
        ans += ch - '0';
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    String str = "123sn67 9d65nksldhsfg";
    System.out.println(Sum(str));
  }
}
