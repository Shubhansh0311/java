package BINARYTREES;

public class DiameterOfATree {

  static class Node {

    Node left, right;

    int data;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public static int height(Node root) {
    if (root == null) {
      return 0;
    }
    int lh = height(root.left);
    int rh = height(root.right);
    return Math.max(lh, rh) + 1;
  }

  //   public static int diameter(Node root) {
  //     if (root == null) return 0;

  //     int lh = height(root.left);
  //     int rh = height(root.right);
  //     int selfDiameter = lh + rh + 1;

  //     int ld = diameter(root.left);
  //     int rd = diameter(root.right);
  //     return Math.max(selfDiameter, Math.max(ld, rd));
  //   }

  static class Info {

    int dia, height;

    Info(int h, int d) {
      this.height = h;
      this.dia = d;
    }
  }

  public static Info diameter(Node root) {
    if (root == null) return new Info(0, 0);

    Info leftInfo = diameter(root.left);
    Info rightInfo = diameter(root.right);

    int finalDiameter = Math.max(
      Math.max(leftInfo.dia, rightInfo.dia),
      leftInfo.height + rightInfo.height + 1
    );
    int finalheight = Math.max(leftInfo.height, rightInfo.height) + 1;
    return new Info(finalheight, finalDiameter);
  }

  
  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(2);
    root.left.left = new Node(4);
    root.right.left = new Node(4);
    root.left.right = new Node(5);
    root.right.right = new Node(7);
    // System.out.println(height(root));
    System.out.println("the diameter of the tree is = " + diameter(root).dia);
  }
}
