package BinaryTree2;

public class productOfTree {
    public static class Node {
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
        }
    }
    public static int product(Node root){
        if(root==null)return Integer.MAX_VALUE;
        return root.data*product(root.left)*product(root.right);
    }
    public static int minvalue(Node root){
        if(root==null)return Integer.MAX_VALUE;
        return Math.min(root.data,Math.min(minvalue(root.right),minvalue(root.left)));
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
        System.out.println(product(root));
        System.out.println(minvalue(root));
    }
}
