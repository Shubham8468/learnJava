package DynamicProgramming;

import java.util.Arrays;

//You are a professional robber planning to rob houses along a street.
// Each house has a certain amount of money stashed, the only constraint stopping
// you from robbing each of them is that adjacent houses have security systems connected
// and it will automatically contact the police if two adjacent houses were broken into on the same night.
//
//Given an integer array nums representing the amount of money of each house,
// return the maximum amount of money you can rob tonight without alerting the police.
public class HouseRobber {
    public int amout(int[] nums, int i , int[] dp){
        if(i>=nums.length)return 0;
        if(dp[i]!=-1){
            return dp[i];
        }
        int take=nums[i]+amout(nums,i+2,dp);// robber diside to take it or skip if it take than move to next
        // two house
        // if it skip in simple he move to next house
        int skip=amout(nums, i+1,dp);

        return dp[i]=Math.max(take,skip);
    }


    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return amout(nums,0,dp);
    }

    //++++++++++++++++ Most Importent mathod to find (tabutation) ++++++++++++++++

}
