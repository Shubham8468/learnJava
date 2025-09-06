package BinaryTree;
//preorder
public class implementaion0 {
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
       else {
           System.out.print("null ");
       }
       if(root.right!=null)System.out.println(root.right.data);
       else {
           System.out.print("null");
       }
       System.out.println();
       Display(root.left);
       Display(root.right);

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
        Display(root);

    }
}
