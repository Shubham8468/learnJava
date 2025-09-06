package BinaryTree;

public class pwPostorder {
    public static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
        }
    }
    public static void Dispaly(Node root){
        if(root==null){
            return;

        }
       if(root.left!=null) System.out.print(root.left.data+" ");
        if(root.right!=null)System.out.print(root.right.data+" ");
        System.out.println(root.data);
        Dispaly(root.left);
        Dispaly(root.right);
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
        Dispaly(root);
    }
}
