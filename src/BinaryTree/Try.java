package BinaryTree;

import java.util.*;
import java.util.Queue;

public class Try {
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
    }

    public static void main(String[] args) {
        int nodes[]={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tr=new BinaryTree();
        Node root=tr.builedTree(nodes);

    }

}


