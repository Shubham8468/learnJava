package Graph;
//Leetcode :- 547
//There are n cities. Some of them are connected, while some are not. If city a is connected directly with city b, and city b is connected directly with city c, then city a is connected indirectly with city c.
//
//A province is a group of directly or indirectly connected cities and no other cities outside of the group.
//
//You are given an n x n matrix isConnected where isConnected[i][j] = 1 if the ith city and the jth city are directly connected, and isConnected[i][j] = 0 otherwise.
//
//Return the total number of provinces.

import java.util.LinkedList;
import java.util.Queue;

public class numbersOfProvinces {
    // Solution No:-1 this is the best method the solve this problem
    //this is the DFS approach for the solve this question ..
    //In that we go depper and backtrack ..
    public void dfs(int i, int[][] ajt, boolean[] vist,int n){
        vist[i]=true;
        for(int j= 0;j<n;j++){
            if(ajt[i][j]==1 && !vist[j]){
                dfs(j,ajt,vist,n);// this the the recursion method for the sovle this problem
            }
        }
    }
    public int findCircleNum1(int[][] ajt) {
        int n=ajt.length;
        int count=0;
        boolean[] vist= new boolean[n];
        for(int i= 0;i<n;i++){
            if(!vist[i]){
                dfs(i,ajt,vist,n);
                count++;
            }
        }
        return count;
    }
    //Solution No:-2
    public int findCircleNum2(int[][] adj){
        int n=adj.length;
        int count=0;
        boolean[] vist= new boolean[n];
        for(int i=0;i<n;i++){
            bfs1(adj,vist,i,n);
            count++;
        }
        return count;
    }

    private void bfs1(int[][] adj, boolean[] vist, int i, int n) {
        Queue<Integer> q= new LinkedList<>();
        q.add(i);
        while(!q.isEmpty()){
            int front=q.remove();
            for(int j= 0;j<n;j++){
                if(adj[front][j]==1 && !vist[j]){
                    q.add(j);
                    vist[j]=true;
                }
            }
        }
    }


}
