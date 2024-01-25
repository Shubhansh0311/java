package BACKTRACKING;

public class MazeProblem {

  public static void printSolution(int arr[][]) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

  // public static boolean isSafe(int maze[][], int i, int j) {
  //   return (
  //     i >= 0 && i < maze.length && j >= 0 && j < maze.length && maze[i][j] == 1
  //   );
  // }

  // // public static boolean wayExist
  // public static boolean solveMaze(int maze[][], int i, int j, int sol[][]) {
  //   if (i == maze.length - 1 && j == maze.length - 1 && maze[i][j] == 1) {
  //     sol[i][j] = 1;
  //     return true;
  //   }
  //   if (isSafe(maze, i, j)) {
  //     if (sol[i][j] == 1) {
  //       return false;
  //     }
  //     sol[i][j] = 1;
  //     if (solveMaze(maze, i + 1, j, sol)) {
  //       return true;
  //     }
  //     if (solveMaze(maze, i, j + 1, sol)) {
  //       return true;
  //     }
  //     sol[i][j] = 0;
  //     return false;
  //   }
  //   return false;
  // }

  public static boolean solveMaze(int maze[][], int i, int j, int sol[][]) {
    if (i == maze.length - 1 && j == maze.length - 1 && maze[i][j] == 1) {
      sol[i][j] = 1;
      return true;
    }
    if (isSafe(maze, i, j)) {
      if (sol[i][j] == 1) {
        return false;
      }
      sol[i][j] = 1;
      if (solveMaze(maze, i + 1, j, sol)) {
        return true;
      }
      if (solveMaze(maze, i, j + 1, sol)) {
        return true;
      }
      sol[i][j] = 0;
      return false;
    }
    return false;
  }

  public static boolean isSafe(int maze[][], int i, int j) {
    return (
      i >= 0 && i < maze.length && j >= 0 && j < maze.length && maze[i][j] == 1
    );
  }

  public static void main(String[] args) {
    int maze[][] = {
      { 1, 0, 0, 0 },
      { 1, 1, 0, 1 },
      { 0, 1, 0, 0 },
      { 1, 1, 1, 1 },
    };
    int sol[][] = new int[4][4];

    // solveMaze(maze, 0, 0, sol);
    if (solveMaze(maze, 0, 0, sol)) {
      System.out.println("Solution does not exist");
    }
    printSolution(sol);
  }
}
