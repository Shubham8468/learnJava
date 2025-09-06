package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Implementaion {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;

        }
    }
    public static class BinaryTree{
        int idx=-1;
        Node builedTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;

            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=builedTree(nodes);
            newNode.right=builedTree(nodes);
            return newNode;

        }
        int coutofNode(Node root){
            if(root==null){
                return 0;
            }
            int leftcout=coutofNode(root.left);
            int rightcout=coutofNode(root.right);
            return leftcout+rightcout+1;
        }
        void levelOrder(Node root){
            if(root==null){
                return ;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()){
               Node currNode=q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else {
                        q.add(null);
                    }
                }
                else {
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null){
                        q.add(currNode.left);

                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }

                }
            }

        }
        int heightOfTree(Node root){
            if(root==null){
                return 0;
            }
            int leftheight=heightOfTree(root.left);
            int rightheight=heightOfTree(root.right);
            int myheight=Math.max(leftheight,rightheight)+1;
            return myheight;
        }
        int sumOfNodes(Node root){
            if(root==null){
                return 0;
            }
            int leftsum=sumOfNodes(root.left);
            int rightsum=sumOfNodes(root.right);
            return leftsum+rightsum+root.data;
        }

    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tr = new BinaryTree();
       Node root = tr.builedTree(nodes);
        System.out.println(root.data);
        System.out.println(tr.coutofNode(root));
        tr.levelOrder(root);
        System.out.println("Height of the binarytree :"+tr.heightOfTree(root));
        System.out.println("Sum of NOdes :"+tr.sumOfNodes(root));


    }
}
