package DynamicProgramming;


import java.util.Arrays;
//You are climbing a staircase. It takes n steps to reach the top.
//
//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

public class ClimbingStairs {
    public int  clim(int[] dp ,int n ){
        if(n==0 || n==1){
            return 1;
        }
        if(dp[n]>=0){
            return dp[n];
        }
        int ans= clim(dp,n-1)+clim(dp,n-2);
        dp[n]=ans;
        return  ans;
    }
    public int climbStairs(int n) {
        int[] dp= new int[n+1];
        Arrays.fill(dp,-1);
        return clim(dp,n);
    }
}
