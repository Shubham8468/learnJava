package BinaryTree;
import java.util.*;
public class CountOfNode {
//    public static class Node{
//        int data;
//        Node left;
//        Node right;
//        Node(int data){
//            this.data=data;
//            this.left=null;
//            this.right=null;
//
//        }
//    }
//    public static class BinaryTree{
//        int idx=-1;
//        Node builedTree(int nodes[]){
//            idx++;
//            if (nodes[idx]==-1) {
//                return null;
//            }
//            Node currNode=new Node(nodes[idx]);
//            currNode.left=builedTree(nodes);
//            currNode.right=builedTree(nodes);
//            return currNode;
//        }
//        int countOfNodes(Node root){
//            if(root==null){
//                return 0;
//            }
//            int countLeft=countOfNodes(root.left);
//            int countRight=countOfNodes(root.right);
//            return countLeft+countRight+root.data;
//        }
//        void levelOrder(Node root){
//            if(root==null){
//                return;
//            }
//            Queue<Node> q=new LinkedList<>();
//            q.add(root);
//            q.add(null);
//            while (!q.isEmpty()){
//                Node currNode=q.remove();
//                if(currNode==null){
//                    System.out.println();
//                    if(q.isEmpty()){
//                        break;
//                    }
//                    else {
//                        q.add(null);
//                    }
//                }
//                else {
//                    System.out.print(currNode.data+" ");
//                    if(currNode.left!=null){
//                        q.add(currNode.left);
//                    }
//                    if(currNode.right!=null){
//                        q.add(currNode.right);
//                    }
//                }
//
//            }
//
//        }
//    }
//    public static void main(String[] args) {
//        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//        BinaryTree tr=new BinaryTree();
//        Node root=tr.builedTree(nodes);
//        System.out.println("Number of node "+tr.countOfNodes(root));
//        tr.levelOrder(root);
//    }

}
