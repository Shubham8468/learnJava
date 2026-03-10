package Graph;

import java.util.ArrayList;

public class DFSTraversal {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
       ArrayList<Integer> ans= new ArrayList<>();
       int n= adj.size();
       boolean[] vist= new boolean[n];
       dfs(0,adj,vist,n,ans);
        return ans;
    }
    public void dfs(int node,ArrayList<ArrayList<Integer>> adj,boolean[] vist,int n,ArrayList<Integer> ans){
        vist[node]=true;
        ans.add(node);
        for(int neverhod:adj.get(node)){
            if(!vist[neverhod]){
                dfs(neverhod,adj,vist,n,ans);
            }
        }
    }
}
