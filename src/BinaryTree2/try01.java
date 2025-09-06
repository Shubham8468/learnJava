package BinaryTree2;

import java.util.*;

public class try01 {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static void Display(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+"->");
        if(root.left!=null)System.out.print(root.left.data+" ");
        else{
            System.out.print("null"+"");
        }

        if(root.right!=null)System.out.println(root.right.data+" ");
        else{
            System.out.println("null"+" ");
        }
        System.out.println();
        Display(root.left);
        Display(root.right);

    }
    
    public static int size(Node root){
        if(root==null){
            return 0;
        }
        return 1+size(root.left)+size(root.right);
    }
    public static int sumofroot(Node root){
        if(root==null){
            return 0;
        }
        return root.data+sumofroot(root.left)+sumofroot(root.right);
    }
    public static int maxval(Node root){
        if(root==null){
            return 0;
        }
        int max=Math.max(root.data,Math.max(maxval(root.left),maxval(root.right)));
        return max;

    }
    public static int  hight(Node root){
        if(root==null){
            return 0;
        }
        if(root.right==null&&root.left==null){
            return 0;
        }
        return 1+Math.max(hight(root.left),hight(root.right));

    }
    public static void printNthLevel(Node root,int n){
       if(root==null){
           return ;
       }
       if(n==1){
           System.out.print(root.data+" ");
       }
       printNthLevel(root.left,n-1);
       printNthLevel(root.right,n-1);

    }
    public static void BFS(Node root){
       if(root==null){
           return ;
       }
       Queue<Node> qe=new LinkedList<>();
        qe.add(root);
        while(qe.size()>0){
            Node temp= qe.peek();
            if(temp.left!=null)qe.add(temp.left);
            if(temp.right!=null)qe.add(temp.right);
            System.out.println(temp.data);
            qe.remove();
        }
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        Node a= new Node(4);
        Node b=new Node(7);
        Node c=new Node(2);
        Node d=new Node(5);
        Node e=new Node(8);
        Node f=new Node(9);
        root.left=a;
        root.right=b;
        a.left=c;
        a.right=d;
        b.right=e;
        e.left=f;
      //  Display(root);
       // System.out.println(size(root));
       //System.out.println(sumofroot(root));
       // System.out.println( maxval(root));
        //System.out.println(hight(root));
        BFS(root);

    }

}
