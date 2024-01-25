package STRINGS;

public class RemoveAllExceptAlphabets {

  public static String RemoveALL(String str) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if ((ch >= 65 && ch <= 90 || ch >= 97 && ch <= 126)) {
        sb.append(ch);
      }
      if(ch==' '){
    
      }
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    String str = "(a+b)=c";
    StringBuilder sb = new StringBuilder(str);
    System.out.println(RemoveALL(str));
  }
}
