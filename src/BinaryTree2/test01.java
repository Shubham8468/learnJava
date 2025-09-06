package BinaryTree2;

import java.util.LinkedList;
import java.util.Queue;

public class test01 {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static void bfs(Node root){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while (q.size()>0){
            Node temp=q.peek();
            if(temp.left!=null)q.add(temp.left);
            if(temp.right!=null)q.add(temp.right);
            System.out.print(temp.data+" ");
            q.remove();
        }
    }
    public static int heigth(Node root){
        if(root==null)return 0;
        int rightheigth=heigth(root.right);
        int leftheigth=heigth(root.left);
        return 1+Math.max(rightheigth,leftheigth);
    }
    public static int diameater(Node root){
        if(root==null)return 0;
        return 2+heigth(root.left)+heigth(root.right);
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        Node a=new Node (2);
        Node b=new Node(3);
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(6);
        Node g=new Node (7);
        Node f=new Node(8);
        root.left=a;
        root.right=b;
        a.left=c;
        a.right=d;
        d.left=g;
        d.right=f;
        b.left=e;
        //bfs(root);
        System.out.println(heigth(root));
        System.out.println(diameater(root));
    }
}
