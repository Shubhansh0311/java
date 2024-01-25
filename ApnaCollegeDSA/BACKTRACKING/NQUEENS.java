package BACKTRACKING;

// complexity O(n!)

public class NQUEENS {




  // 🔥🔥🔥🔥🔥when condtion are not checked 🔥🔥🔥🔥🔥
  // public static void Nqueen(char[][] board, int row) {
  //   if (row == board.length) {
  //     printBoard(board);
  //     return;
  //   }
  //   for (int j = 0; j < board.length; j++) {
  //     board[row][j] = 'Q';
  //     Nqueen(board, row + 1); //function call
  //     board[row][j] = '-'; //backtracking
  //   }
  // }

  public static boolean isSafe(char[][] board, int row, int col) {
    // 👉⬆️
    for (int i = row - 1; i >= 0; i--) {
      if (board[i][col] == 'Q') {
        return false;
      }
    }
    // 👉↖️
    for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
      if (board[i][j] == 'Q') {
        return false;
      }
    }
    // 👉↗️
    for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
      if (board[i][j] == 'Q') {
        return false;
      }
    }

    return true;
  }

  public static void Nqueen(char[][] board, int row) {
    if (row == board.length) {
      printBoard(board);
      printBoard(board);
      return;
    }

    for (int col = 0; col < board.length; col++) {
      if (isSafe(board, row, col)) {
        board[row][col] = 'Q';
        Nqueen(board, row + 1); //function call
        board[row][col] = '.'; //backtrack
      }
    }
  }

  public static void printBoard(char[][] board) {
    System.out.println("___________chess__________");
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int n = 6;
    char[][] board = new char[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        board[i][j] = '.';
      }
    }
    Nqueen(board, 0);
  }
  // 🔥when condition are checked

}
