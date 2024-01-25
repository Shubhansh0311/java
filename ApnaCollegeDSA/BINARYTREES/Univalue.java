package BINARYTREES;

public class Univalue {

  static class Node {

    int data;
    Node left, right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public static boolean uniValued(Node root) {
    if (root == null) {
      return true;
    }

    if (root.left != null && root.data != root.left.data) {
      return false;
    }

    if (root.right != null && root.data != root.right.data) {
      return false;
    }

    return uniValued(root.left) && uniValued(root.right);
  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(1);
    root.right = new Node(1);
    root.left.left = new Node(1);
    root.left.right = new Node(1);
    root.right.left = new Node(1);
    root.right.right = new Node(1);

    System.out.println(uniValued(root));
    if (uniValued(root)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
