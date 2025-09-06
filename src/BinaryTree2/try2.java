package BinaryTree2;

import javax.swing.plaf.nimbus.NimbusStyle;
import java.util.LinkedList;
import java.util.Queue;

public class try2 {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static int hieght(Node root){
        if(root==null)return 0;
        int righthigth=hieght(root.right);
        int leftheght=hieght(root.left);
        return Math.max(righthigth,leftheght);
    }
    public static int sum(Node root){
        if(root==null)return 0;
        return root.data+sum(root.left)+sum(root.right);
    }
    public static int numberofnode(Node root){
        if(root==null)return 0;
        return 1+numberofnode(root.left)+numberofnode(root.right);
    }
    public static void bfs(Node root){
        Queue<Node > q=new LinkedList<>();
        q.add(root);
        while (q.size()>0){
            Node temp=q.peek();
            if(temp.left!=null)q.add(temp.left);
            if(temp.right!=null)q.add(temp.right);
            System.out.println(temp.data+" ");
            q.remove();
        }
    }
    public static int maxnum(Node root){
        if(root==null)return Integer.MIN_VALUE;
        return Math.max(root.data,Math.min(maxnum(root.left),maxnum(root.right)));
    }
    public static void Nthlevel(Node root,int n){
        if(root==null)return;
        if(n==1){
            System.out.print (root.data+" ");
        }
        Nthlevel(root.right,n-1);
        Nthlevel(root.left,n-1);
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
        //bfs(root);
        //System.out.println(maxnum(root));
        //System.out.println(hieght(root));
        Nthlevel(root,2);
    }
}
