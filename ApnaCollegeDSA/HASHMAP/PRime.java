package HASHMAP;

public class PRime {

  public static void main(String[] args) {
    boolean ans = true;
    int n = 2;
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        ans = false;
      }
    }
    if (ans) {
      System.out.println("prime");
    } else {
      System.out.println("Not a prime");
    }
  }
}
