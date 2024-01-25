package BINARYTREES;

import java.util.ArrayList;

public class A_1_LowestCommonAncester {

  static class Node {

    Node left, right;

    int data;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public static boolean getpath(Node root, int n, ArrayList<Node> path) {
    if (root == null) {
      return false;
    }
    path.add(root);
    if (root.data == n) {
      return true;
    }

    boolean foundLeft = getpath(root.left, n, path);
    boolean foundRight = getpath(root.right, n, path);

    if (foundLeft || foundRight) {
      return true;
    }
    path.remove(path.size() - 1);
    return false;
  }

  public static Node LCA(Node root, int n1, int n2) {
    // for storing the paths

    ArrayList<Node> path1 = new ArrayList<>();
    ArrayList<Node> path2 = new ArrayList<>();

    // to get the path from the nodes
    getpath(root, n1, path1);
    getpath(root, n2, path2);
    int i = 0;
    // for traversing and finding the last common ancester
    for (; i < path1.size() && i < path2.size(); i++) {
      if (path1.get(i) != path2.get(i)) {
        break;
      }
    }
    Node lca = path1.get(i - 1);
    return lca;
  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
    int n1 = 6, n2 = 5;
    System.out.println(LCA(root, n1, n2).data);
  }
}
