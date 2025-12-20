class Solution {
    public int f(int i,int cs,int amt,int coins[],int dp[][]){
        if(cs==amt)return 0;
        if(cs>amt||i<0)return (int)1e9;
        //take 
        int take = 0;
        int notTake = 0;
        if(dp[i][cs]!=-1)return dp[i][cs];
        take = 1+f(i,cs+coins[i],amt,coins,dp); 
        notTake = f(i-1,cs,amt,coins,dp);
        return dp[i][cs] = Math.min(take,notTake);
    }
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int dp[][] = new int[n+1][amount+1];
        for(int arr[]:dp){
            Arrays.fill(arr,-1);
        }
        int res = f(n-1,0,amount,coins,dp);
        if(res==(int)1e9)return -1;
        return res;
    }
}