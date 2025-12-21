package BinaryTree2.Questions.BstLeetcode;

import Stack.Display;

public class InsertANodeInBST {
    public static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(10);
       Node b=new Node(5);
       Node c=new Node(50);
        Node d=new Node(1);
        Node e=new Node(40);
       Node f=new Node(100);
        a.left=b;
        b.left=d;
        a.right=c;
        c.left=e;
        c.right=f;
        Insert(a,150);
        Display(a);
    }

    private static Node Insert(Node root, int val) {
        if(root==null){
            Node temp=new Node(val);
            return temp;
        }
        if(root.data>val){
            Node temp=new Node(val);
            if(root.left==null){
                root.left=temp;
            }
            else{
                Insert(root.left,val);
            }
        }
        else{
            Node temp=new Node(val);
            if(root.right==null){
                root.right=temp;
            }
            else{
                Insert(root.right,val);
            }
        }
        return root;
    }






    public static void Display(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        Display(root.left);
        Display(root.right);
    }

}
