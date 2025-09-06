package BinaryTree2;

public class printNthElement {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static int hight(Node root){
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 0;
        }
        return 1+hight(root.left)+hight(root.right);
    }
public static void nthprint(int n,Node root){
        if(root==null)return;
        if(n==1){
            System.out.print  (root.data+" ");
        }
            nthprint(n-1,root.left);
            nthprint(n-1,root.right);
}
public static void Nprint(int n,Node root){
    if(root==null)return;
    if(n==1){
        System.out.print  (root.data+" ");
    }
    nthprint(n-1,root.right);
    nthprint(n-1,root.left);

   }
   public static Node getnode(Node root,int start){
        if(root==null){
            return null;
        }
        if(root.data==start){
            return root;
        }
        getnode(root.left,start);
        getnode(root.right,start);
        return root;
   }
    public static void main(String[] args) {
        Node root = new Node(3);
       Node a = new Node(9);
        Node b = new Node(20);
        Node c = new Node(15);
        Node d =new Node(7);
        root.left = a;
        root.right = b;
        b.right = d;
        b.left = c;

        //int level=hight(root);
        //for(int i=1;i<=level;i++){
      //      Nprint(i,root);
        //    System.out.println();
       // }
       Node te=getnode(root,9);
        System.out.println(te.data);

    }
}
