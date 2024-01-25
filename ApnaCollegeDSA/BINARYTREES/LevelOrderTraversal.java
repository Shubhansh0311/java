package BINARYTREES;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderTraversal {

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

  static class BinaryTree {

    int idx = -1;

    public Node buildTree(int node[]) {
      idx++;
      if (node[idx] == -1) {
        return null;
      }
      Node newnode = new Node(node[idx]);
      newnode.left = buildTree(node);
      newnode.right = buildTree(node);
      return newnode;
    }

    public void LevelOrder(Node root) {
      Queue<Node> q = new LinkedList<>();
    //   adding the root node and null
      q.add(root);
      q.add(null);
    //   checking the queue is empty or not
      while (!q.isEmpty()) {
        Node curr = q.remove();
        if (curr == null) {//if it is null printing the next line 
          System.out.println();
          if (q.isEmpty()) {//in case of emoty breaking 
            break;
          } else {//adding null
            q.add(null);
          }
        } 
        // if current is not null printing the current data 
        else { 
          System.out.print(curr.data + " ");
          if (curr.left != null) {
            q.add(curr.left);
          }
          if (curr.right != null) {
            q.add(curr.right);
          }
        }
      }
    }
  }

  public static void main(String[] args) {
    BinaryTree b = new BinaryTree();
    int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
    Node root = b.buildTree(nodes);
    // System.out.println(root.data);
    b.LevelOrder(root);
  }
}
