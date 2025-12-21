package BinaryTree2.Questions.BstLeetcode;

import java.util.ArrayList;

public class KthSmallestInBst {
    public static class Node {
     int data;
     Node right;
     Node left;
     Node(int data){
         this.data=data;
     }
    }
//    Given the root of a BST and an integer k, the task is to find the
//    kth smallest element in the BST. If there is no kth smallest
//    element present then return -1.
    public static void main(String[] args) {
        Node a=new Node(10);
       Node b=new Node(5);
      Node c=new Node(50);
       Node d=new Node(1);
        Node e=new Node(40);
        Node f=new Node(100);
        a.left=b;
        b.left=d;
        a.right=c;
        c.left=e;
        c.right=f;
        System.out.println(Smallest(a,2));
    }
    public static int Smallest(Node root,int k){
        ArrayList<Integer> arr=new ArrayList<>();
        inorder(root,arr);
        return arr.get(k-1);
    }
    public static void inorder(Node root, ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        inorder(root.left,arr);
        arr.add(root.data);
        inorder(root.right,arr);
    }
        //this is the secound solution of this question
//    class Solution {
//        public int ans;
//        public int k2;
//
//        public void inorder(TreeNode root){
//            if(root==null){
//                return ;
//            }
//            inorder(root.left);
//            k2--;
//            if(k2==0){
//                ans=root.val;
//            }
//            inorder(root.right);
//        }
//        public int kthSmallest(TreeNode root, int k) {
//            k2=k;
//            ans=-1;
//            inorder(root);
//            return ans;
//
//        }
//    }
}
