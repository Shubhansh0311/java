package BINARY_SEARCH_TREE;

import java.util.logging.LogRecord;
import javax.management.relation.RoleResult;
import javax.swing.text.AbstractDocument.LeafElement;

public class MaxBSTsize {

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

  public static void Inorder(Node root) {
    if (root == null) {
      return;
    }
    Inorder(root.left);
    System.out.print(root.data + " ");
    Inorder(root.right);
  }

  //   for storing the info creating the info class
  public static int maxBST = 0;
  public static Node root = null;

  public static class Info {

    Boolean isBST;
    int min, max, size;

    Info(boolean isBST, int min, int max, int size) {
      this.size = size;
      this.max = max;
      this.min = min;
      this.isBST = isBST;
    }
  }

  public static Info largerstBST(Node root) {
    if (root == null) {
      return new Info(true, Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
    }
    Info leftInfo = largerstBST(root.left);
    Info rightInfo = largerstBST(root.right);
    int size = leftInfo.size + rightInfo.size + 1;
    int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
    int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

    if (root.data <= leftInfo.max || root.data >= rightInfo.min) {
      return new Info(false, min, max, size);
    }
    if (leftInfo.isBST && rightInfo.isBST) {
      maxBST = Math.max(maxBST, size);
      // root= root.left;
      return new Info(true, min, max, size);
    }
    return new Info(false, min, min, size);
  }

  public static void main(String[] args) {
    Node root = new Node(50);
    root.left = new Node(30);
    root.left.left = new Node(5);
    root.left.right = new Node(20);
    root.right = new Node(60);
    root.right.left = new Node(45);
    root.right.right = new Node(70);
    root.right.right.left = new Node(65);
    root.right.right.right = new Node(80);
    // Inorder(root);
    //  to get the info we have to create the object
    Info info = largerstBST(root);
    System.out.println(maxBST);
    System.out.println(root.data);
  }
}
