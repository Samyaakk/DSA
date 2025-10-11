class Solution {
    public int f(int i,int j,int prices[],int dp[][]){
        if(i>=prices.length)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(j==1){
            return dp[i][j] = Math.max(-prices[i]+f(i+1,0,prices,dp),f(i+1,1,prices,dp));
        }else{
            return dp[i][j] = Math.max(prices[i]+f(i+1,1,prices,dp),f(i+1,0,prices,dp));
        }
    }
    public int maxProfit(int[] prices) {
        int n = prices.length;
        // int dp[][] = new int[n][2];
        // for(int arr[]:dp){
        //     Arrays.fill(arr,-1);
        // }
        // return f(0,1,prices,dp);
        int next[] = new int[2];
        for(int i=n-1;i>=0;i--){
            int curr[] = new int[2];
            for(int j=0;j<2;j++){
                if(j==1){
                    curr[j] = Math.max(-prices[i]+next[0],next[1]);
                }else{
                    curr[j] = Math.max(prices[i]+next[1],next[0]);
                }
            }
            next = curr;
        }
        return next[1];
    }
}