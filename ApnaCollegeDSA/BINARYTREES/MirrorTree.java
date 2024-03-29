package BINARYTREES;

public class MirrorTree {

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

  public static Node mirror(Node root) {
    if (root == null) {
      return null;
    }
    Node left = mirror(root.left);
    Node right = mirror(root.right);

    root.left = right;
    root.right = left;
    return root;
  }

  // inorder traversal
  // left
  // root
  // ṛight

  public static void inorder(Node root) {
    if (root == null) {
      return;
    }
    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
  }


  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
    inorder(root);

    System.out.println();
    mirror(root);
    inorder(root);
  }
}
