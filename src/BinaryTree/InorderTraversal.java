package BinaryTree;

public class InorderTraversal {
    public static class Node{
        int data;
        Node rigth;
        Node left;
        Node(int data){
            this.data=data;
            this.rigth=null;
            this.left=null;
        }
    }
    public static class BineryTree{
        int idx=-1;
        Node builedTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=builedTree(nodes);
            newNode.rigth=builedTree(nodes);
            return newNode;

        }
        void inoder(Node root){
            if(root==null){
                return ;
            }
            inoder(root.left);
            System.out.print(root.data+" ");
            inoder(root.rigth);
        }
    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BineryTree tr=new BineryTree();
       Node root= tr.builedTree(nodes);
       tr.inoder(root);
    }
}
