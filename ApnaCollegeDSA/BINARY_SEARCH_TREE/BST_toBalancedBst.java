package BINARY_SEARCH_TREE;

import java.util.ArrayList;
import javax.swing.event.InternalFrameAdapter;

public class BST_toBalancedBst {

  static class Node {

    int data;
    Node left, right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public static Node inorder(ArrayList<Integer> arr, Node root) {
    if (root == null) {
      return null;
    }
    inorder(arr, root.left);
    arr.add(root.data);
    inorder(arr, root.right);

    return root;
  }

  public static Node balancedBST(int arr[], int start, int end) {
    ArrayList<Integer> ar = new ArrayList<>();
    if (start > end) {
      return null;
    }
    int mid = (start + end) / 2;
    Node root = new Node(arr[mid]);
    root = inorder(ar, root);
    root.left = balancedBST(arr, start, mid - 1);
    root.right = balancedBST(arr, mid + 1, end);
    return root;
  }

  public static void PreeOrder(Node root) {
    if (root == null) {
      return;
    }
    System.out.print(root.data + " ");
    PreeOrder(root.left);
    PreeOrder(root.right);
  }

  public static void main(String[] args) {
    int arr[] = {3,5,6,8,10,11,12 };
    Node root = balancedBST(arr, 0, arr.length - 1);
    PreeOrder(root);
  }
}
