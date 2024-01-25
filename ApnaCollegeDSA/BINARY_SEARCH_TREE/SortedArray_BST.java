package BINARY_SEARCH_TREE;

import BINARYTREES.PreeOrder;
import BINARY_SEARCH_TREE.PrintPath.Node;
import javax.security.auth.login.CredentialException;

public class SortedArray_BST {

  static class Node {

    int data;
    Node left, right;

    Node(int data) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  public static Node CreateBST(int arr[], int start, int end) {
    if (start > end) {
      return null;
    }
    int mid = (start + end) / 2;
    Node root = new Node(arr[mid]);
    root.left = CreateBST(arr, start, mid - 1);
    root.right = CreateBST(arr, mid + 1, end);
    return root;
  }

  public static void PreeOrder(Node root) {
    if (root == null) {
      return;
    }
    PreeOrder(root.left);
    System.out.print(root.data + " ");
    PreeOrder(root.right);
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    PreeOrder(CreateBST(arr, 0, arr.length - 1));
  }
}
