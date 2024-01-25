package BINARYTREES;

public class A_2_LowestCommonAncester {

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

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
    System.out.print(LCA_2(root, 4, 5).data);
  }
}
