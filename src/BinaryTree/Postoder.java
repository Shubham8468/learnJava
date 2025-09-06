package BinaryTree;

public class Postoder {
    public static class Node{
        int data;
        Node left;
        Node rigth;
        Node(int data){
            this.data=data;
            this.left=null;
            this.rigth=null;

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
            newNode.rigth=builedTree(nodes);
            return newNode;
        }
        void postoder(Node root){
            if(root==null){
                return ;

            }
            postoder(root.left);
            postoder(root.rigth);
            System.out.print(root.data+" ");
        }
    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tr=new BinaryTree();
        Node root=tr.builedTree(nodes);
        tr.postoder(root);
    }
}
