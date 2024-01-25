package BINARYTREES;

public class PreeOrder {

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

  static class BinaryTree {

    int idx = -1;

    public Node buildTree(int node[]) {
      idx++;
      if (node[idx] == -1) {
        return null;
      }
      Node newnode = new Node(node[idx]);
      newnode.left = buildTree(node);
      newnode.right = buildTree(node);
      return newnode;
    }

    public void PreeOrder(Node root) {
      // root
      // left subtree
      // right subtree

      if (root == null) {
        // System.out.print(-1 + " ");
        return;
      }
      System.out.print(root.data + " ");
      PreeOrder(root.left);
      PreeOrder(root.right);
    }

    public void PostOrder(Node root) {
      // left subtree
      // right subtree
      // root

      if (root == null) {
        // System.out.print(-1 + " ");
        return;
      }
      PostOrder(root.left);
      PostOrder(root.right);
      System.out.print(root.data + " ");
    }
  }

  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();
    int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
    Node root = tree.buildTree(nodes);
    // System.out.println(root.data);
    tree.PreeOrder(root);
    System.out.println();
    tree.PostOrder(root);
  }
}
