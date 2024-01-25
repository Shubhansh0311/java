package STRINGS;

public class Toggle {

  public static String toggle(String str, String newstr) {
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);

      if (ch >= 65 && ch <= 90) {
        int a = ch + 32;
        newstr += (char) a;
      } else if (ch >= 97 && ch <= 122) {
        int a = ch - 32;
        newstr += (char) a;
      }
    }
    return newstr;
  }

  public static void main(String[] args) {
    String str = "sHuBHanSH";
    System.out.println(str);
    System.out.println(toggle(str, ""));
  }
}
