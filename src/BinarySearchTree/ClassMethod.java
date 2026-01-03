package BinarySearchTree;

public class ClassMethod {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
   public static class Qued{
        int max;
        int min;
        int size;
        int sum;
        Qued(int max,int min, int size,int sum){
            this.max=max;
            this.min=min;
            this.size=size;
            this.sum=sum;
        }
        void dispaly(){
            System.out.println(max+"" +min+" "+size+" "+sum);
        }
   }
   public static   Qued maxMinSizeSum(Node root){
        if(root==null){
            return new Qued(Integer.MIN_VALUE,Integer.MAX_VALUE,0,0);
        }
        Qued lst=maxMinSizeSum(root.left);
        Qued rst=maxMinSizeSum(root.right);
        int max=Math.max(root.data,Math.max(lst.max, rst.max));
        int min=Math.min(root.data,Math.min(lst.min, rst.min));
        int size=1+lst.size+rst.size;
        int sum=root.data+ lst.sum+ rst.sum;
        return new Qued(max,min,size,sum);
   }
    public static void main(String[] args) {
      Node a=new Node(3);
      Node b=new Node(4);
        Node c=new Node(2);
        Node d=new Node(-1);
        Node e=new Node(1);
        Node f=new Node(6);
        Node g=new Node(9);
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f;c.right=g;

        maxMinSizeSum(a).dispaly();



    }
}
