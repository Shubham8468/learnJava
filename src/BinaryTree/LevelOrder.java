package BinaryTree;
import java.util.*;
public class LevelOrder {
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
    public static class BinartTree{
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
        void levelorder(Node root){//here we pass the root of the binaryTree
            if(root==null){//First we cheked if root is null so we simpal code is tarminated or return
                return ;
            }
            //And we creat Queue for store tree values
            Queue<Node> q=new LinkedList<>();
            q.add(root);//First we store root Element in the queue than we store null;that why next level element print
            q.add(null);//new Line ;
            while(!q.isEmpty()){
                Node currNode=q.remove();//here we make new Node currNode to store element when we remove element for the queue
                if(currNode==null){//Then we checked currNode is null ?
                    System.out.println();//Simpaly we will go next Line.
                    if(q.isEmpty()){//This condition use to if Queue is Empty So in case we break loop;
                        break;
                    }
                    else{//if remove element is null.In this case we add null element again in the Queue
                        q.add(null);
                    }
                }
                else {//If remove Element is Not null
                    System.out.print(currNode.data+" ");//So we Simpal print .
                    if(currNode.left!=null){//Then we explore left element from the currNode.
                        q.add(currNode.left);//And store in the Queue.
                    }
                    if(currNode.rigth!=null){//And Again we explore the Right element form the currNode.
                        q.add(currNode.rigth);//Than we store in the queue.
                    }
                }
            }
        }



    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinartTree br=new BinartTree();
       Node root= br.builedTree(nodes);
       br.levelorder(root);
    }
}
