package BINARY_SEARCH_TREE;

public class PrintInRange {

  static class Node {

    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public static Node insert(Node root, int data) {
    if (root == null) {
      root = new Node(data);
      return root;
    }
    if (root.data > data) {
      root.left = insert(root.left, data);
    }
    if (root.data < data) {
      root.right = insert(root.right, data);
    }
    return root;
  }

  public static void PrintInRanges(Node root, int k1, int k2) {
    if (root == null) {
      return;
    }
    if (root.data >= k1 && root.data <= k2) {
      PrintInRanges(root.left, k1, k2);
      System.out.print(root.data + " ");
      PrintInRanges(root.right, k1, k2);
    } else if (root.data >k1) {
      PrintInRanges(root.left, k1, k2);
    } else {
      PrintInRanges(root.right, k1, k2);
    }
  }

  public static void main(String[] args) {
    Node root = null;
    int arr[] = { 1, 4, 9, 6, 2, 7, 3, 8, 5 };
    for (int i = 0; i < arr.length; i++) {
      root = insert(root, arr[i]);
    }
    PrintInRanges(root, 5, 12);
  }
}
