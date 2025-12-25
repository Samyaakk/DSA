class Solution {
    public int f(int n){
        if(n==0||n==1)return 1;
        int ans = 0;
        for(int i=0;i<n;i++){
            ans+=f(i)*f(n-i-1);
        }
        return ans;
    }
    public int numTrees(int n) {
        // return f(n);
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            int ans = 0;
            for(int j=0;j<i;j++){
                ans += dp[j]*dp[i-j-1];
            }
            dp[i] = ans;
        }
        return dp[n];
    }
}