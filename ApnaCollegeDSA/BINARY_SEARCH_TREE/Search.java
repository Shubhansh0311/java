package BINARY_SEARCH_TREE;

public class Search {

  // Complexity O(H);
  // H=height of the tree

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

  public static void Inorder(Node root) {
    if (root == null) {
      return;
    }
    Inorder(root.left);
    System.out.print(root.data + " ");
    Inorder(root.right);
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

  public static boolean search(Node root, int n) {
    if (root == null) {
      return false;
    }
    if (root.data == n) {
      return true;
    }
    if (root.data > n) {
      return search(root.left, n);
    } else {
      return search(root.right, n);
    }
  }

  // delete
  public static Node FindInOrderSuccessor(Node root) {
    while (root.left != null) {
      root = root.left;
    }
    return root;
  }

  public static Node delete(Node root, int key) {
    if (root.data < key) {
      root.right = delete(root.right, key);
    } else if (root.data > key) {
      root.left = delete(root.left, key);
    } else {
      // leaf node
      if (root.left == null && root.right == null) {
        return null;
      }

      // single child

      if (root.left == null) {
        return root.right;
      } else if (root.right == null) {
        return root.left;
      }
      // root node
      Node IS = FindInOrderSuccessor(root.right);
      root.data = IS.data;
      root.right = delete(root.right, IS.data);
    }
    return root;
  }

  public static void main(String[] args) {
    Node root = null;
    int arr[] = { 1, 4, 9, 6, 2, 7, 3, 8, 5 };
    for (int i = 0; i < arr.length; i++) {
      root = insert(root, arr[i]);
    }
    Inorder(root);

    // if (search(root, 8)) {
    //   System.out.println("key found ");
    // } else {
    //   System.out.println("key not found ");
    // }
    delete(root, 1);
    System.out.println();
    Inorder(delete(root, 1));
  }
}
