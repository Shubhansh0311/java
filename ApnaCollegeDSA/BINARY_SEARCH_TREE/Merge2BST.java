package BINARY_SEARCH_TREE;

import java.util.ArrayList;
import java.util.concurrent.Flow.Publisher;
import javax.swing.text.AbstractDocument.LeafElement;

public class Merge2BST {

  static class Node {

    int data;
    Node left, right;

    Node(int data) {
      this.data = data;
      this.left = right = null;
    }
  }

  public static void inOrder(Node root, ArrayList<Integer> arr) {
    if (root == null) {
      return;
    }
    inOrder(root.left, arr);
    arr.add(root.data);
    inOrder(root.right, arr);
    // return root;
  }

  public static Node createBST(ArrayList<Integer> arr, int start, int end) {
    if (start > end) {
      return null;
    }
    int mid = (start + end) / 2;
    Node root = new Node(arr.get(mid));
    root.left = createBST(arr, start, mid - 1);

    root.right = createBST(arr, mid + 1, end);
    return root;
  }

  public static Node MergeBST(Node root1, Node root2) {
    // step 1

    ArrayList<Integer> arr1 = new ArrayList<>();
    inOrder(root1, arr1);
    ArrayList<Integer> arr2 = new ArrayList<>();
    inOrder(root2, arr2);
    ArrayList<Integer> finalArray = new ArrayList<>();

    // step 2
    int i = 0, j = 0;
    while (i < arr1.size() && i < arr2.size()) {
      if (arr1.get(i) <= arr2.get(j)) {
        finalArray.add(arr1.get(i));
        i++;
      } else {
        finalArray.add(arr2.get(j));
        j++;
      }

    }
      // for the rest element to be added within in the list
      while (i < arr1.size()) {
        finalArray.add(arr1.get(i));
        i++;
      }
      while (j < arr2.size()) {
        finalArray.add(arr2.get(j));
        j++;
      }
    return createBST(finalArray, 0, finalArray.size() - 1);
  }

  public static void preOrder(Node root) {
    if (root == null) {
      return;
    }

    System.out.print(root.data + " ");
    preOrder(root.left);
    preOrder(root.right);
    // return root;
  }

  public static void main(String[] args) {
    Node root1 = new Node(2);
    root1.left = new Node(1);
    root1.right = new Node(4);

    Node root2 = new Node(9);
    root2.left = new Node(3);
    root2.right = new Node(12);

    Node root = MergeBST(root1, root2);
    preOrder(root);
  }
}
