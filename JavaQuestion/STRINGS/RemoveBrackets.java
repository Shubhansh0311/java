package STRINGS;

public class RemoveBrackets {

  public static String RemoveALL(String str) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (
        !(
          ch == '{' ||
          ch == '}' ||
          ch == '(' ||
          ch == ')' ||
          ch == '[' ||
          ch == ']'
        )
      ) {
        sb.append(ch);
      }
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    String str = "(a+b)=c";
    String str1 = "[a{A}+C+d+B}}";

    StringBuilder sb = new StringBuilder(str1);
    System.out.println(RemoveALL(str1));
  }
}
