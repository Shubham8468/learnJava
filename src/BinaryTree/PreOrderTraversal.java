package BinaryTree;
//Time complexity of Preorder treversal is o(n);
//becues we go to one by one to all nodes;
public class PreOrderTraversal {
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
    public static class BinaryTree {
        int idx = -1;

        Node builadTree(int nodes[]) {
            idx++;
            Node newNode;
            if (nodes[idx] == -1) {
                return null;
            }
            else {
                newNode = new Node(nodes[idx]);
                newNode.left = builadTree(nodes);
                newNode.rigth = builadTree(nodes);

            }
            return newNode;

        }
        void preorder(Node root ){
            if(root==null){
                return ;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.rigth);
        }
    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tr=new BinaryTree();
        Node root=tr.builadTree(nodes);
        System.out.println(root.data+" ");
        System.out.println(" ");
        tr.preorder(root);

    }
}
