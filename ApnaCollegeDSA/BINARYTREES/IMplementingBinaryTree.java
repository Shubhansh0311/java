package BINARYTREES;

public class IMplementingBinaryTree {

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
  }

  public static void main(String[] args) {
    BinaryTree b = new BinaryTree();
    int nodes[] = {  4, 8,9,6,9, 3, 2 };
    Node root = b.buildTree(nodes);
    System.out.println(root.data);
  }
}
