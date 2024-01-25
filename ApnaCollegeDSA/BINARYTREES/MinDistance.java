package BINARYTREES;

import java.lang.Math;

public class MinDistance {

  static class Node {

    int data;
    Node left, right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public static Node LCA_2(Node root, int n1, int n2) {
    if (root == null || root.data == n1 || root.data == n2) {
      return root;
    }

    Node rightLCA = LCA_2(root.right, n1, n2);
    Node leftLCA = LCA_2(root.left, n1, n2);
    if (leftLCA == null) {
      return rightLCA;
    }
    if (rightLCA == null) {
      return leftLCA;
    }
    return root;
  }

  public static int findDistance(Node root, int n) {
    if (root == null) {
      return -1;
    }
    if (root.data == n) {
      return 0;
    }
    int left = findDistance(root.left, n);
    int right = findDistance(root.right, n);

    if (left == -1 && right == -1) {
      return -1;
    } else if (left == -1) {
      return right + 1;
    } else if (right == -1) {
      return left + 1;
    }
    return 0;
  }

  public static int MinDistances(Node root, int n1, int n2) {
    Node lca = LCA_2(root, n1, n2);
    int leftD = findDistance(lca, n1);
    int rightD = findDistance(lca, n2);

    return leftD + rightD;
  }

  //   kth ancester

  public static int KthAncester(Node root, int n, int k) {
    if (root == null) {
      return -1;
    }

    if (root.data == n) {
      return 0;
    }
    int leftdist = KthAncester(root.left, n, k);
    int rightdist = KthAncester(root.right, n, k);
    if (rightdist == -1 && leftdist == -1) {
      return -1;
    }
    int max = Math.max(leftdist, rightdist);

    if (max + 1 == k) {
      System.out.println(
        "I am the ancester of " + n + " my value is " + root.data
      );
    }
    return max + 1;
  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
    // System.out.print(MinDistances(root, 4, 7));
    KthAncester(root, 5, 1);
  }
}
