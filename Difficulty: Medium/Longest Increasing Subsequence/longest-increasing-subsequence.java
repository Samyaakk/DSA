class Solution {
    static int f(int i,int p,int arr[],int dp[][]){
        if(i==arr.length)return 0;
        if(dp[i][p+1]!=-1)return dp[i][p+1];
        int len = 0;
        if(p==-1 || arr[i]>arr[p]){
             len = 1+f(i+1,i,arr,dp);
        }
        return dp[i][p+1] = Math.max(len,f(i+1,p,arr,dp));
    }
    static int lis(int arr[]) {
        // code here
        int n = arr.length;
        int dp[][] = new int[n][n+1];
        for(int ar[]:dp){
            Arrays.fill(ar,-1);
        }
        return f(0,-1,arr,dp);
    }
}