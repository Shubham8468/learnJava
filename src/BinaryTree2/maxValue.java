package BinaryTree2;

import BinaryTree.sizeMaxSumHeight;

public class maxValue {
    public static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
        }

    }
public static int maxvalue(Node root){
        if(root==null)return Integer.MIN_VALUE;//becuse we did not

        return Math.max(root.data,Math.max(maxvalue(root.left),maxvalue(root.right)));
}
public static int hight(Node root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(hight(root.left),hight(root.right));

}
    public static void main(String[] args) {
        Node root=new Node(-1);
        Node a=new Node(-2);
        Node b=new Node(-3);
        root.left=a;
        root.right=b;
        Node c=new Node(-4);
        Node d=new Node(-5);
        Node e=new Node(-6);
        a.left=c;
        a.right=d;
        b.right=e;
        //System.out.println(maxvalue(root));\
        System.out.println(hight(root));
    }
}
