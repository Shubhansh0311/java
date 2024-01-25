package STRINGS;

public class ReplaceWithGivenWord {
//👉👉 replace method
  public static void main(String[] args) {
    String str = "the taj mahal";
    String replace = "the";
    str=str.replaceAll("the", "");
    str= str.trim();
    System.out.println(str);
  }
}
