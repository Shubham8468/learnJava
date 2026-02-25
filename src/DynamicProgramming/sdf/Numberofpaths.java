package DynamicProgramming.sdf;

public class Numberofpaths {
    // find the uniqe path tha and return the numbers of paths
    public int path(int sr,int sc, int m, int n, int[][] dp){
        if(sr>=m || sc>= n){
            return 0;
        }
        if(sr== m-1 && sc== n-1){
            return 1; // this is the fine distination ponit
        }
        if(dp[sr][sc]!=-1){
            return dp[sr][sc];
        }
        int leftPath=path(sr,sc+1,m,n,dp);// find leftPath
        int rightPath=path(sr+1,sc,m,n,dp);// Find rightPath total path
        return dp[sr][sc]=leftPath+rightPath;
    }
    public int numberOfPaths(int m, int n) {
        // code here
        //user Dp
        int[][] dp= new int[m][n];
        // that i assin into -1 by default
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        // i will pass sr sc with are 0 0  and push m n ans also dp ..
        return path(0,0,m,n,dp);
    }
}
