class Solution {
    public int f(int i,int j,int prices[],int dp[][]){
        if(i>=prices.length)return 0;
        if(j>=4)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(j%2==0){
            return dp[i][j] = Math.max(-prices[i]+f(i+1,j+1,prices,dp),f(i+1,j,prices,dp));
        }else{
            return dp[i][j] = Math.max(prices[i]+f(i+1,j+1,prices,dp),f(i+1,j,prices,dp));
        }
    }
    public int maxProfit(int[] prices) {
        int n = prices.length;
        // int dp[][] = new int[n][4];
        // for(int arr[]:dp){
        //     Arrays.fill(arr,-1);
        // }
        // return f(0,0,prices,dp);
        int next[] = new int[5];
        for(int i=n-1;i>=0;i--){
            int curr[] = new int[5];
            for(int j=3;j>=0;j--){
                if(j%2==0){
                    curr[j] = Math.max(-prices[i]+next[j+1],next[j]);
                }else{
                    curr[j] = Math.max(prices[i]+next[j+1],next[j]);
                }
            }
            next = curr;
        }
        return next[0];
    }
}