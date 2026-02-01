package HashMap;

import javax.management.Query;
import java.util.*;
// in this we create a class which name is paire its contains node and distence
// than we use bfs

public class TopViweOfBST {
    public class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
        }
    }
    class paire {
        Node node;
        int dis;
        paire(Node node , int dis){
            this.node=node;
            this.dis=dis;
        }
    }
    public ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> ans= new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        Queue<paire> q= new LinkedList<>();
        q.add(new paire(root,0));
        int mindis=Integer.MAX_VALUE , maxdis=Integer.MIN_VALUE;
        while(q.size()>0){
            paire front=q.remove();
            Node node=front.node;
            int dist= front.dis;
            mindis=Math.min(dist,mindis);
            maxdis=Math.max(dist,maxdis);
            if(!map.containsKey(dist)) map.put(dist,node.data);
            if(node.left!=null) q.add(new paire(node.left,dist-1));
            if(node.right!=null) q.add(new paire(node.right,dist+1));
        }
        for(int i=mindis;i<=maxdis ;i++){
            ans.add(map.get(i));
        }
         return ans;
        // here we use BFS


    }
}
