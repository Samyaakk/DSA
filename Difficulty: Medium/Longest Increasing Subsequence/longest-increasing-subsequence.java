class Solution {
    public static int f(int i,int p,int arr[],int dp[][]){
        //bc 
        if(i==arr.length)return 0;
        if(dp[i][p+1]!=-1)return dp[i][p+1];
        //poss
        int len = 0;
        if( p==-1 || arr[p]<arr[i]){
            len = 1+f(i+1,i,arr,dp);
        }
        len = Math.max(len,f(i+1,p,arr,dp));
        return dp[i][p+1] = len;
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