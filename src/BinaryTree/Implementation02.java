package BinaryTree;

import Stack.Display;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
    }
}

public class Implementation02 {
    public static void main(String[] args) {
//                 3
//               /   \
//             4       2
//            /  \    /  \
//         -1   1   6     9
    Node a=new Node(3);
    Node b=new Node(4);
    Node c=new Node(2);
    Node g=new Node(-1);
    Node d=new Node(1);
    Node e=new Node(6);
    Node f=new Node(9);
    a.left=b;
    a.right=c;
    b.right=d;
    b.left=g;
    c.left=e;
    e.left=f;

//    Display(a);
        //System.out.println(Size(a));
//        System.out.println(sum(a));
//        System.out.println("Max valu of the binary tree is :"+maxValu(a));
//        System.out.println("Min value of  the binary tree is "+minValu(a));
        System.out.println(leveOfTree(a));

    }








    public static  void Display(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        Display(root.left);
        Display(root.right);

    }
    public static int Size(Node root){
        return (root==null)? 0 : (1+Size(root.left)+Size(root.right));
    }
    public static int sum(Node root){
        return (root==null)?0 :(root.data+sum(root.left)+sum(root.right));
    }
    public  static int maxValu(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data, Math.max(maxValu(root.left),maxValu(root.right)));
    }
    public  static int minValu(Node root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.data,Math.min(minValu(root.left),minValu(root.right)));
    }
    public static int leveOfTree(Node root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(leveOfTree(root.left),leveOfTree(root.right));
    }
}
