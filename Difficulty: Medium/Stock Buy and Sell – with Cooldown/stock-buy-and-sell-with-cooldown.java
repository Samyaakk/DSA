// User function Template for Java

class Solution {
    public long f(int i,int b,long arr[],long dp[][]){
        if(i==arr.length)return 0;
        if(dp[i][b]!=-1)return dp[i][b];
        if(b==1){
            return dp[i][b] = Math.max(-arr[i]+f(i+1,0,arr,dp),f(i+1,1,arr,dp));
        }else{
            if(i+2<arr.length)return dp[i][b] = Math.max(arr[i]+f(i+2,1,arr,dp),f(i+1,0,arr,dp));
            else return dp[i][b] = Math.max(arr[i],f(i+1,0,arr,dp));
        }
    }
    public long maximumProfit(long arr[], int n) {
        // Code here
        long dp[][] = new long[n][2];
        for(long ar[]:dp){
            Arrays.fill(ar,-1);
        }
        return f(0,1,arr,dp);
        // long dp[][] = new long[n+1][2];
        // for(int i=n-1;i>=0;i--){
        //     for(int b=0;b<2;b++){
        //         if(b==1){
        //             dp[i][b] = Math.max(-arr[i]+dp[i+1][0],dp[i+1][1]);
        //         }else{
        //             if(i+2<arr.length)dp[i][b] = Math.max(arr[i]+dp[i+2][1],dp[i+1][0]);
        //             else dp[i][b] = arr[i];
        //         }
        //     }
        // }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<2;j++){
        //         System.out.print(dp[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        // return dp[0][1];
    }
}
