class Solution {
    static int f(int i,int j,int arr[],int dp[][]){
        //bc
        if(i==j)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        //poss
        int mini = Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
             int count = arr[i-1]*arr[k]*arr[j]+f(i,k,arr,dp)+f(k+1,j,arr,dp);
             mini = Math.min(mini,count);
        }
        //retrun 
        return dp[i][j] = mini;
    }
    static int matrixMultiplication(int arr[]) {
        // code here
        int n = arr.length;
        int dp[][] = new int[n+1][n+1];
        for(int ar[]:dp){
            Arrays.fill(ar,-1);
        }
        return f(1,n-1,arr,dp);
    }
}