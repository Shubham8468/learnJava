package BinaryTree;

class SumOfNodes {
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
        Node builedTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.right=builedTree(nodes);
            newNode.left=builedTree(nodes);
            return newNode;
        }
        int SumOfNodes(Node root){
            if(root==null){
                return 0;
            }
            int leftsum=SumOfNodes(root.left);
            int rightsum=SumOfNodes(root.right);
            return leftsum+rightsum+root.data;
        }
    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tr=new BinaryTree();
        Node root=tr.builedTree(nodes);
        System.out.println(tr.SumOfNodes(root));

    }
}
