package STRINGS;

public class Count_AND_removeVowel {

  public static int count(String str) {
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (
        ch == 'a' ||
        ch == 'e' ||
        ch == 'i' ||
        ch == 'o' ||
        ch == 'u' ||
        ch == 'A' ||
        ch == 'E' ||
        ch == 'I' ||
        ch == 'O' ||
        ch == 'U'
      ) {
        count++;
      }
    }
    return count;
  }

  public static String RemoveVowel(String str) {
    String tempstr = "";
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (
        ch == 'a' ||
        ch == 'e' ||
        ch == 'i' ||
        ch == 'o' ||
        ch == 'u' ||
        ch == 'A' ||
        ch == 'E' ||
        ch == 'I' ||
        ch == 'O' ||
        ch == 'U'
      ) {
        continue;
      }
      else{
        tempstr += ch;
        System.out.println(tempstr);
      }
    }

    return tempstr;
  }

  public static void main(String[] args) {
    String str = "shubhansh";
    System.out.println(count(str));

    // System.out.println(str);
    System.out.println(RemoveVowel(str));
  }
}
