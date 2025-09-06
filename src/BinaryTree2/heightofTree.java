package BinaryTree2;

/**
 * This class provides functionality to determine the height of a binary tree
 * and perform preorder traversal on the tree.
 */
public class heightofTree {

    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static void preorder(Node root){
        if(root==null)return;
        System.out.println(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static int heigth(Node root){
        if(root==null)return 0;
        if(root.left==null&&root.right==null){
            return 0;
        }
       int leftheight=heigth(root.left);
       int rightheight=heigth(root.right);
       int heigth=1+Math.max(leftheight,rightheight);
       return heigth;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
      Node a = new Node(2);
      Node b = new Node(3);
       Node c = new Node(4);
       Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(7);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.right = e;
        e.left = f;
        System.out.println(heigth(root));
    }
}
