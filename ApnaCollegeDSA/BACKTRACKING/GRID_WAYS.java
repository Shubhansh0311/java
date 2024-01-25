package BACKTRACKING;

// complexity O(2^m+n)
public class GRID_WAYS {

  public static int gridways(int i, int j, int row, int col) {
    if (i == row - 1 && j == col - 1) {
      return 1;
    } else if (i == row || j == col) {
      return 0;
    }
    // moving downwards ⬇️
    int way1 = gridways(i + 1, j, row, col);
    // moving towards right
    int way2 = gridways(i, j + 1, row, col);
    return way1 + way2;
  }

  // second ways to calculate grid area
  public static int fact(int n) {
    if (n == 0) {
      return 1;
    }
    {
      return n * fact(n - 1);
    }
  }

  public static void main(String[] args) {
    int m = 10, n = 10;

    System.out.println("total number of grid ways " + gridways(0, 0, m, n));
    //     fact1 = (fact((m + n) - 2));
    //     long fact2 = fact(m - 1) * fact(n - 1);
    //     System.out.println(fact1 / fact2);
  }
}
