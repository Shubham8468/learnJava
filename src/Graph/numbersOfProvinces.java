package Graph;
//There are n cities. Some of them are connected, while some are not. If city a is connected directly with city b, and city b is connected directly with city c, then city a is connected indirectly with city c.
//
//A province is a group of directly or indirectly connected cities and no other cities outside of the group.
//
//You are given an n x n matrix isConnected where isConnected[i][j] = 1 if the ith city and the jth city are directly connected, and isConnected[i][j] = 0 otherwise.
//
//Return the total number of provinces.

public class numbersOfProvinces {
    // Solution No:-1
    public void bfs(int i, int[][] ajt, boolean[] vist,int n){
        vist[i]=true;
        for(int j= 0;j<n;j++){
            if(ajt[i][j]==1 && !vist[j]){
                bfs(j,ajt,vist,n);// this the the recursion method for the sovle this problem
            }
        }
    }
    public int findCircleNum(int[][] ajt) {
        int n=ajt.length;
        int count=0;
        boolean[] vist= new boolean[n];
        for(int i= 0;i<n;i++){
            if(!vist[i]){
                bfs(i,ajt,vist,n);
                count++;
            }
        }
        return count;
    }
    //

}
