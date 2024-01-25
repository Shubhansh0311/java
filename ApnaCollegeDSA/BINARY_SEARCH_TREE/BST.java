package BINARY_SEARCH_TREE;

import javax.print.DocFlavor.INPUT_STREAM;
import javax.xml.crypto.Data;

public class BST {

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
    System.out.print(root.data+" ");
    Inorder(root.right);
  }

  public static void main(String[] args) {
    Node root = null;
    int arr[] = { 1, 4, 9, 6, 2, 7, 3, 8, 5 };
    for (int i = 0; i < arr.length; i++) {
      root = insert(root, arr[i]);
    }
    Inorder(root);
  }
}
