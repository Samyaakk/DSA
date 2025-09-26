class Solution {
    int f(int n,int dp[]){
        if(n==2||n==1)return n;
        if(dp[n]!=-1)return dp[n];
        return dp[n] = f(n-1,dp)+f(n-2,dp);
    }
    int countWays(int n) {
        // your code here
        //memo
        // int dp[] = new int[n+1];
        // Arrays.fill(dp,-1);
        // return f(n,dp);
        //tab 
        // if(n<=2)return n;
        // int dp[] = new int[n+1];
        // dp[1]=1;
        // dp[2]=2;
        // for(int i=3;i<=n;i++){
        //     dp[i] = dp[i-1]+dp[i-2];
        // }
        // return dp[n];
        //spaceop
        if(n<=2)return n;
        int prev2 = 1;
        int prev = 2;
        for(int i=3;i<=n;i++){
            int curr = prev2+prev;
            prev2 = prev;
            prev  =curr;
        }
        return prev;
    }
}
