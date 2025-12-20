class Solution {
    public int f(int i,int cr,int R,int arr[],int dp[][]){
        if(i<0)return 0;
        int take = 0;
        if(dp[i][cr]!=-1)return dp[i][cr];
        if(cr+i+1<=R)take = arr[i]+f(i,cr+(i+1),R,arr,dp);
        int notTake = 0;
        notTake = f(i-1,cr,R,arr,dp);
        return dp[i][cr] = Math.max(take,notTake);
    }
    public int cutRod(int[] price) {
        // code here
        int n = price.length;
        int dp[][] = new int[n+1][n+1];
        for(int arr[]:dp){
            Arrays.fill(arr,-1);
        }
        return f(n-1,0,n,price,dp);
    }
}