package BINARY_SEARCH_TREE;

import java.util.ArrayList;
import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

public class PrintPath {

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

  public static void printPath(ArrayList<Integer> path) {
    for (int i = 0; i < path.size(); i++) {
      System.out.print(path.get(i) + " -> ");
    }
    System.out.println("NUll");
  }

  public static void findPath(Node root, ArrayList<Integer> path) {
    if (root == null) {
      return;
    }
    path.add(root.data);
    if (root.left == null && root.right == null) {
      printPath(path);
    }
    findPath(root.left, path);
    findPath(root.right, path);
    path.remove(path.size() - 1);
  }

  public static void main(String[] args) {
    Node root = null;
    int arr[] = { 8,5,3,6,10,11,14 };
    for (int i = 0; i < arr.length; i++) {
      root = insert(root, arr[i]);
    }
    ArrayList<Integer> path = new ArrayList<>();

    findPath(root, path);
  }
}
