class Solution {
    public int f(int i,int cs,int T,int arr[],int dp[][]){
        if(cs==T){
            cs = 0;
            return 1;
        }else if(cs>T)return 0;
        if(dp[i][cs]!=-1)return dp[i][cs];
        int take =f(i,cs+arr[i],T,arr,dp);
        int notTake  = 0;
        if(i>=1)notTake = f(i-1,cs,T,arr,dp);
        return dp[i][cs] =  take+notTake;
    }
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int dp[][] = new int[n][amount];
        for(int arr[]:dp){
            Arrays.fill(arr,-1);
        }
        return f(n-1,0,amount,coins,dp);
    }
}