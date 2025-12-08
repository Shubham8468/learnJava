package BinaryTree2.Questions;


import java.util.ArrayList;

public class RightView {
    public static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
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
    rightView(a);

    }
    public static ArrayList<Integer> rightView(Node root){
        ArrayList<Integer> ans=new  ArrayList<>();
        view(root,0,ans);
        return ans;
    }
    public static  void view( Node root,int level, ArrayList<Integer> ans){
        if(root==null){
            return ;
        }
        if(level>=ans.size()){

        }
    }
}
