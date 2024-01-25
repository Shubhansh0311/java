package RECURSION;

// 2*n tiling
public class TILINGPROBLEM {

  public static int Nways(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }
    // for vertical placing
    int Vways = Nways(n - 1);

    // horizontal placing
    int Hways = Nways(n - 2);
    return Vways + Hways;
  }

  public static void main(String[] args) {
    int n = 4;
    System.out.println(Nways(n));
  }
}
