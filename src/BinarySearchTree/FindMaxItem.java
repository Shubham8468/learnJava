package BinarySearchTree;

public class FindMaxItem {
    public static class  Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a =new Node(30);
        Node b=new Node(28);
       Node c=new Node(27);
       Node d=new Node(35);
        Node e=new Node(34);
        a.left=b;
        a.right=d;
        b.left=c;
        d.left=e;
        System.out.println(maxIntem(a));
    }
    public static int maxIntem(Node root){
        if(root==null){
            return 0;
        }
        Node temp=root;
        while (temp.left!=null){
            temp=temp.left;
        }
        return temp.data;
    }
}
