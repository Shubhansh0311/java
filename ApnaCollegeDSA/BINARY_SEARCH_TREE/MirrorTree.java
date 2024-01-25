package BINARY_SEARCH_TREE;

public class MirrorTree {
    
 
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
    System.out.print(root.data + " ");
    Inorder(root.right);
  }

  public static Node mirror(Node root) {
    if (root == null) {
      return null;
    }

    Node left = mirror(root.left);
    Node right = mirror(root.right);
    root.left = right;
    root.right = left;
    return root;
  }

  public static void main(String[] args) {
    Node root = null;
    int arr[] = { 1, 2, 3, 4, 5 };
    for (int i = 0; i < arr.length; i++) {
      root = insert(root, arr[i]);
    }
    Inorder(root);
    System.out.println();
    System.out.println("after mirroring");
    Inorder(mirror(root));
    // System.out.println(Validate(root, null, null));
  }
}


