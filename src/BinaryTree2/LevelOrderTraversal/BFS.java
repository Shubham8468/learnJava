package BinaryTree2.LevelOrderTraversal;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(3);
        Node b=new Node(4);
        Node c=new Node(2);
       Node g=new Node(-1);
       Node d=new Node(1);
       Node e=new Node(6);
       Node f=new Node(9);
        a.left=b;
        a.right=c;
        b.right=d;
        b.left=g;
        c.left=e;
        e.left=f;
//        Display(a);
        BfsLevelOrder(a);
    }
    public static void BfsLevelOrder(Node root){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while (q.size()!=0){
            Node temp=q.peek();
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
            System.out.print(temp.data+" ");
            q.remove();
        }
    }
    public static void Display(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data +" ");
        Display(root.left);
        Display(root.right);
    }
}
