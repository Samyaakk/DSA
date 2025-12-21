class Solution {
    public int f(int i,int tr,int arr[]){
        if(i==arr.length||tr==4)return 0;
        if(tr%2==0){
            return Math.max(-arr[i]+f(i+1,tr+1,arr),f(i+1,tr,arr));
        }else{
            return Math.max(arr[i]+f(i+1,tr+1,arr),f(i+1,tr,arr));
        }
    }
    public int maxProfit(int[] prices) {
        // return f(0,0,prices);
        int n = prices.length;
        int dp[][] = new int[n+1][5];
        for(int i=n-1;i>=0;i--){
            for(int j=3;j>=0;j--){
                if(j%2==0){
                    dp[i][j] = Math.max(-prices[i]+dp[i+1][j+1],dp[i+1][j]);
                }else{
                    dp[i][j] = Math.max(prices[i]+dp[i+1][j+1],dp[i+1][j]);
                }
            }
        }
        return dp[0][0];
    }
}