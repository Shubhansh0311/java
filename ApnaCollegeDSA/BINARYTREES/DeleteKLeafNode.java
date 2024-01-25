package BINARYTREES;

import java.util.HashMap;

import javax.xml.crypto.Data;

public class DeleteKLeafNode {

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

  public static Node deleteK(Node root, int n) {
    if (root == null) {
      return null;
    }
    root.left = deleteK(root.left, n);
    root.right = deleteK(root.right, n);
    // int lefts = root.left == null ? 0 : root.left.data;
    // int rights = root.right == null ? 0 : root.right.data;
    if (root.data == n && root.left == null && root.right == null) {
      return null;
    }

    return root;
  }

  public static void inorder(Node root) {
    if (root == null) {
      return;
    }
    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
  }


// //   find duplicate
//   public static String insorder(Node root) {
//     HashMap<String, Integer> map = new HashMap<>();
//     if (root == null) {
//       return "";
//     }
//     String str = "";
//     str += insorder(root.left);
//     str += Integer.toString(root.data);
//     // System.out.print(root).data + " ");
//     str += insorder(root.right);

//     str += "";
//     if (map.get(str) != null && map.get(str) == 1) {
//       map.put(str, map.get(str) + 1);
//     } else {
//       map.put(str, 1);
//     }
//     return str;
//   }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(3);
    root.right = new Node(3);
    root.left.left = new Node(3);
    root.left.right = new Node(2);
    // root.right.left = new Node(6);
    // root.right.right = new Node(7);
    inorder(root);
    deleteK(root, 3);
    System.out.println();
    inorder(root);
    System.out.println();
  }
}
