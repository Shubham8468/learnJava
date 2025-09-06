package BinaryTree;

public class pwinorder {
    public static class Node {
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
        }
    }
    public static void Dispaly(Node root){
        if(root==null)return;
        if(root.left!=null) System.out.print(root.left.data+" ");
        System.out.print(root.data+" ");
        if(root.right!=null) System.out.println(root.right.data);
        Dispaly(root.left);
        Dispaly(root.right);

    }

    public static void main(String[] args) {
        Node root=new Node(2);
        Node a=new Node(3);
        Node b=new Node(7);
        root.left=a;
        root.right=b;
        Node c=new Node(45);
        Node d=new Node(78);
        a.left=c;
        a.right=d;
        Node e=new Node(90);
        d.left=e;
        Dispaly(root);
    }
}
