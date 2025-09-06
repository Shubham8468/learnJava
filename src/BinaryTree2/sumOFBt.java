package BinaryTree2;

public class sumOFBt {
    public static class Node{
        int data;

        Node left;
        Node right;
        Node (int data){
            this.data=data;
        }
    }
    public static int sumOftree(Node root){
        if(root==null)return 0;
        return root.data+sumOftree(root.left)+sumOftree(root.right);
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        Node a=new Node(2);
        Node b=new Node(3);
        root.left=a;
        root.right=b;
        Node c=new Node(4);
        Node d=new Node(5);

        a.left=c;
        a.right=d;
        System.out.println(sumOftree(root));

    }
}
