package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PathExitsInGroup {
//    public void bfs(int start,List<List<Integer>> adj,boolean[] vist){
//        Queue<Integer> q= new LinkedList<>();
//        q.add(start);
//        while (!q.isEmpty()){
//            int font=q.remove();
//            for(int ele : adj.get(font)){
//                if(!vist[ele]){
//                    q.add(ele);
//                    vist[ele]=true;
//                }
//
//            }
//        }
//    }
//    public boolean validPath(int n, int[][] edges, int start, int end) {
//        List<List<Integer>> adj= new ArrayList<>();
//        boolean[] vist= new boolean[n];
//        if(start==end)return true;
//        // iska size n rkhna hai aur n empthy list dalna hai isme
//        for (int i = 0; i < n; i++) {
//            List<Integer> list= new ArrayList<>();
//            adj.add(list);// insert Empty list inside the adj
//
//        }
//        for (int i = 0; i < edges.length; i++) {
//            //adj me colum do hi hai bus
//            int a=edges[i][0], b=edges[i][1]; // becouse give is {{1,0},{2,4}} so we travel on this
//            adj.get(a).add(b);
//            adj.get(b).add(a);
//
//        }
//        bfs(start,adj,vist);
//        return vist[end];
//    }

    public void dfs(int start, List<List<Integer>> adj,boolean[] vist){
        vist[start]=true;
        for(int ele: adj.get(start)){
            if(!vist[ele]){
                dfs(ele,adj,vist);
            }
        }
    }
public boolean validPath(int n, int[][] edges, int start, int end) {
// make a adj list than apply DFS or BFS
    List<List<Integer>> adj= new ArrayList<>();
    boolean[] vist= new boolean[n];
    if(start==end){
        return true;
    }
    for (int i = 0; i < n; i++) {
        List<Integer> list= new ArrayList<>();
        adj.add(list);
    }
    // add item in that
    for (int i = 0; i < edges.length; i++) {
        int a=edges[i][0] , b=edges[i][1];
        adj.get(a).add(b);
        adj.get(b).add(a);
    }
    dfs(start,adj,vist);
    return vist[end];

}
}
