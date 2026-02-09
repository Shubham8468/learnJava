package DynamicProgramming;

public class basic_01 {
    //    public static void printFib(int num){
//        int a=0;
//        int b=1;
//        while(a<=num){
//            int next=a+b;
//            System.out.println(a);
//            a=b;
//            b=next;
//        }
//    }
    //1.
// this are use to find the n th fibonic num with the help of recursion
//    if(n<=1)return n;
//        return fib(n-1)+fib(n-2);
    public static void main(String[] args) {
        //printFib(20);
    }


//2. use DP for the better oproeach

//    static int[] dp; // these are called memoization or lookup table
//    public int helper(int n){
//        if(n<=1)return n;
//        if(dp[n]!=0) return dp[n]; // again call return
//        int ans=helper(n-1)+helper(n-2);
//        dp[n]=ans; // store  call item;
//        return ans;
//
//    }
//    public  int fib1(int n) {
//        dp= new int[n+1];
//        return helper(n);
//    }


//+++++++++++++++++++++++++++++++++++ 3 mthod ++++++++++++++++++++++++++++++++++++++++

    // Now agina a new Method is Tabulation
    // in this we create a arr which size is n+1;
    // and aging value 0 or 1 idex wise
    // and simple use formula
    // dp[i] =dp[i-1]+dp[i-2];
    // and return dp[n];


    public static int fib(int n) {
        if (n <= 0) return n;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

}