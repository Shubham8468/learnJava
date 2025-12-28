package BinaryTree.ClassImplemantation;

import BinaryTree2.printNthElement;

public class bianaryTreeClass {
    public static class Quied{
        int size;
        int max;
        int min;
        Quied(int max, int min, int size){
            this.size=size;
            this.max=max;
            this.min=min;
        }
    }
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
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
        helper(root);
        System.out.println(Quied.size);
    }
    public static Quied helper(Node root){

    }
}
