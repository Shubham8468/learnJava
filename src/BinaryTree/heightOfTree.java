package BinaryTree;

public class heightOfTree {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;

        }
    }
    public static class BinaryTree{
        int idx=-1;
        Node builedTree(int nodes[] ){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node Newnode= new Node(nodes[idx]);
            Newnode.left=builedTree(nodes);
            Newnode.right=builedTree(nodes);
            return Newnode;
        }
        int heightofTree(Node root){
            if(root==null){
                return 0;
            }
            int heightofLeft=heightofTree(root.left);
            int heightofRight=heightofTree(root.right);
            int height=Math.max(heightofLeft,heightofLeft)+1;
            return height;

        }
    }

    public static void main(String[] args) {
    int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    BinaryTree tr=new BinaryTree();
    Node root=tr.builedTree(nodes );
    System.out.println(tr.heightofTree(root));




    }
}
