package BinaryTree2.Questions;

import Stack.Display;

public class LowestCommAncenster {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(45);
        Node c=new Node(23);
        Node d=new Node(12);
        Node e=new Node(67);
        Node f=new Node(89);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        d.left=f;
        System.out.println(LowestCommAncc(a,a,f));

//        Display(a);
//        System.out.println(isexist(a,89));

    }
    public static void Display(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        Display(root.left);
        Display(root.right);
    }
    public static boolean isexist(Node root,Node   temp){
     if(root==null){
         return false;
     }
     if(root==temp){
         return true;
     }
    return isexist(root.left,temp)||isexist(root.right,temp);
    }
    public static int LowestCommAncc(Node root, Node a,Node b){
        if(root==null){
            return 0;
        }
        if(root==a || root==b){
            return a.data;
        }
        boolean aInLeft=isexist(root.left,a);
        boolean bInLeft=isexist(root.left,b);
         if (aInLeft&& bInLeft){
            return LowestCommAncc(root.left,a,b);
        } else if (!aInLeft && !bInLeft) {
             return LowestCommAncc(root.right,a,b);

         }
         else {
             return root.data;
         }

    }

}
