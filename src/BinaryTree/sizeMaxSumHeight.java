package BinaryTree;

public class sizeMaxSumHeight {
    static int size=0;
    //this is (size) use as global variabal
    public static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
        }

    }
    public static void preorder(Node root){
        if(root==null)return;
        size++;
        preorder(root.left);
        preorder(root.right);
    }



    public static void main(String[] args) {
       Node root=new Node(1);
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
        preorder(root);
        System.out.println(size);

    }
}
