class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        dp[m-1][n-1] = 1;
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(i==m-1 && j==n-1)continue;
                int left = 0;
                int up   = 0;
                if(j+1<n)left = dp[i][j+1];
                if(i+1<m)up  = dp[i+1][j];
                dp[i][j] = left+up;
            }
        }
        return dp[0][0];
    }
}