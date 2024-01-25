package BINARYTREES;

import java.util.LinkedList;
import java.util.Queue;

public class Kthlevel {

  static class Node {

    int data;
    Node left, right;

    public Node(int data) {
      this.data = data;
    }
  }

//   iterative
public static void KlevelIterative(Node root,int level,int k){
    Queue <Node> q= new LinkedList<>();
    q.add(root);
    q.add(null);

    while(!q.isEmpty()){
        Node curr=q.remove();
        if(curr==null){System.out.println();
            if(q.isEmpty()){
                break;
            }
            else{
                q.add(curr);
            }
        }
        else{ 
            if(level==k){
                System.out.print(curr.data+" ");
            }
            if(curr.left!=null){
            q.add(curr.left);
        }
        else if(curr.right!=null){
            q.add(curr.right);
        }}
    }

}

//   recursive
  public static void Klevel(Node root, int level, int k) {
    if (root == null) return;
    if (level == k) {
      System.out.print(root.data + " ");
      return;
    }
    Klevel(root.left, level + 1, k);
    Klevel(root.right, level + 1, k);
  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.right.left = new Node(6);
    root.left.right = new Node(5);
    root.right.right = new Node(7);
    Klevel(root, 1, 3);
  }
}
