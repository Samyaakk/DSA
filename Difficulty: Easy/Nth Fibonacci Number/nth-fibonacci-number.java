// User function Template for Java

class Solution {
    // public int f(int n,int dp[]){
    //     if(n==0||n==1)return n;
    //     if(dp[n]!=-1)return dp[n];
    //     return dp[n] = f(n-1,dp)+f(n-2,dp);
    // }
    public int nthFibonacci(int n) {
        // code here
        // int dp[] = new int[n+1];
        // Arrays.fill(dp,-1);
        // return f(n,dp);
        //tab 
        // int dp[] = new int[n+1];
        // dp[0]=0;
        // dp[1]=1;
        // for(int i=2;i<=n;i++){
        //     dp[i]=dp[i-1]+dp[i-2];
        // }
        // return dp[n];
        //space opt 
        if(n<=1)return n;
        int prev2 = 0;
        int prev = 1;
        for(int i=2;i<=n;i++){
            int curr = prev+prev2;
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
}