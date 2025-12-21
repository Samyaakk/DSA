class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int dp[][] = new int[n][2];
        dp[0][0] = -prices[0];
        for(int i=1;i<n;i++){
            for(int j=0;j<=1;j++){
                if(j==1){
                    dp[i][j] = Math.max(prices[i]+dp[i-1][0],dp[i-1][1]);
                }else{
                    dp[i][j] = Math.max(-prices[i]+dp[i-1][1],dp[i-1][0]);
                }
            }
        }
        return dp[n-1][1];
    }
}