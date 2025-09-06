package BinaryTree;

public class DimeterOFTree {
    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int data ){
            this.data=data;
            this.left=null;
            this.right=null;
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
}
