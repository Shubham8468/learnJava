package BinaryTree2.Questions;

import javax.swing.tree.AbstractLayoutCache;
//Given a Binary Search Tree (BST) and a range l-h (inclusive),
//your task is to return the number of nodes in the BST whose
//value lie in the given range.
public class lieInAGivenRange {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node (int data){
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
        System.out.println(getCount(a,5,45));
    }
    public static int getCount(Node root,int l , int h){
        if(root==null){
            return 0;
        }
        if(root.data<l){
            return getCount(root.right,l,h);
        }
        else if(root.data>h){
            return getCount(root.left,l,h);
        }
        else{
            // l<=root.data <=h
            return 1+getCount(root.left,l,h) +getCount(root.right,l,h);
        }
    }
}
