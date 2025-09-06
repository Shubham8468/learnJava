package BinaryTree2;

import BinaryTree.sizeMaxSumHeight;

public class allInone {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static int sumoftree(Node root){
        if(root==null)return 0;
        return root.data+sumoftree(root.left)+sumoftree(root.right);
    }
    public static int size(Node root){
        if(root==null)return 0;
        return 1+size(root.left)+size(root.right);
    }
    public static int max(Node root){
        if(root==null)return Integer.MIN_VALUE;
        return Math.max(root.data,Math.max(max(root.left),max(root.right)));
    }

    public static void main(String[] args) {
        Node root=new Node(23);
        Node a=new Node(2);
        Node b=new Node(3);
        root.left=a;
        root.right=b;
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(6);
        a.left=c;
        a.right=d;
        b.right=e;
        System.out.println(size(root));
        System.out.println(sumoftree(root));
        System.out.println(max(root));
    }
}
