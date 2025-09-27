class Solution {
    static int f(int i,int j,int arr[],int dp[][]){
        if(i==j)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        int min = Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int steps = (arr[i-1]*arr[k]*arr[j]) + f(i,k,arr,dp)+ f(k+1,j,arr,dp);
            min = Math.min(min,steps);
        }
        return dp[i][j] = min;
    }
    static int matrixMultiplication(int arr[]) {
        // code here
        int n = arr.length;
        // int dp[][] = new int[n][n];
        // for(int ar[]:dp){
        //     Arrays.fill(ar,-1);
        // }
        // return f(1,n-1,arr,dp);
        int dp[][] = new int[n][n];
        for(int i=n-1;i>0;i--){
            for(int j=i+1;j<n;j++){
                int min = Integer.MAX_VALUE;
                    for(int k=i;k<j;k++){
                        int steps = (arr[i-1]*arr[k]*arr[j]) + dp[i][k]+dp[k+1][j];
                        min = Math.min(min,steps);
                    }
                    dp[i][j] = min;
            }
        }
        return dp[1][n-1];
    }
}