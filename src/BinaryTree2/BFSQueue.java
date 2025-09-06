package BinaryTree2;

import java.util.LinkedList;
import java.util.Queue;

public class BFSQueue {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static void bfs(Node root){//Iterative 
        Queue<Node >q=new LinkedList<>();
        q.add(root);
        while (q.size()>0){
            Node temp=q.peek();
            if(temp.right!=null)q.add(temp.right);
            if(temp.left!=null)q.add(temp.left);
            System.out.print(temp.data+" ");
            q.remove();
        }
    }
    public static int minval(Node root){
        if(root==null) {
            return Integer.MAX_VALUE;
        }
        return Math.min(root.data,Math.min(minval(root.left),minval(root.right)));

    }
    public static int maxnum(Node root){
        if(root==null)return Integer.MIN_VALUE;
        return Math.max(root.data,Math.max(maxnum(root.left),maxnum(root.right)));
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(7);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.right = e;
        e.left = f;
       // bfs(root);
        System.out.println(maxnum(root));
        System.out.println();
        System.out.println(minval(root));

    }
}
