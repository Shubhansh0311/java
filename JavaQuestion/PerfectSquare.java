class PerfectSquare {

  // program to check whether the number is perfect square or not
  public static boolean CheckPerfectSquare(int n) {
    if (n >= 0) {
      int sr = (int) Math.sqrt(n);
      return (sr * sr == n);
    }
    return false;
  }

  public static void main(String[] args) {
    int n = 99;
    System.out.print(CheckPerfectSquare(n));
  }
}
