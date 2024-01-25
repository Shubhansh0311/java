package RECURSION;

public class NumberOfHandShake {

  public static void main(String[] args) {
    int n =8;
    int ans = (n * (n - 1)) / 2;
    System.out.println("handshake between the " + n + " will be " + ans);
  }
}
