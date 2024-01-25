package BINARYTREES;

import java.rmi.server.UnicastRemoteObject;
import java.util.function.UnaryOperator;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class SumTree {

  static class Node {

    int data;
    Node left, right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public static int sum(Node root) {
    if (root == null) {
      return 0;
    }
    int leftSum = sum(root.left);
    int rightSum = sum(root.right);

    int data = root.data;
    int newleft = root.left == null ? 0 : root.left.data;
    int newright = root.right == null ? 0 : root.right.data;
    root.data = newleft + leftSum + newright + rightSum;

    return data;
    // return 0;

  }

  public static void preorder(Node root) {
    if (root == null) {
      return;
    }
    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(1);
    root.right = new Node(1);
    root.left.left = new Node(1);
    root.left.right = new Node(1);
    root.right.left = new Node(1);
    root.right.right = new Node(1);
    // sum(root);
    // preorder(root);

  }
}
