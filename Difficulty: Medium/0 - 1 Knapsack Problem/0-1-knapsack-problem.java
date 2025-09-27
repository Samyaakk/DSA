class Solution {
    static int f(int i,int W,int val[],int wt[],int TW,int dp[][]){
        if(i==val.length)return 0;
        if(dp[i][W]!=-1)return dp[i][W];
        int tw1 = 0;
        int tw2 = 0;
        if(W+wt[i]<=TW){
            tw1 = Math.max(val[i] + f(i+1,W+wt[i],val,wt,TW,dp),f(i+1,W,val,wt,TW,dp));
        }else{
            tw2 = f(i+1,W,val,wt,TW,dp);
        }
        return dp[i][W] = Math.max(tw1,tw2);
    }
    static int knapsack(int W, int val[], int wt[]) {
        // code here
        int n = val.length;
        int dp[][] = new int[n][W+1];
        for(int arr[]:dp){
            Arrays.fill(arr,-1);
        }
        return f(0,0,val,wt,W,dp);
    }
}
