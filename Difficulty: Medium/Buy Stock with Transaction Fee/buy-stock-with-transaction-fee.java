
class Solution {
    public int f(int i,int b,int k,int arr[],int dp[][]){
        if(i==arr.length)return 0;
        if(dp[i][b]!=-1)return dp[i][b];
        if(b==1){
            return dp[i][b] = Math.max(-arr[i]+f(i+1,0,k,arr,dp),f(i+1,1,k,arr,dp));
        }else{
            return dp[i][b] = Math.max(arr[i]+f(i+1,1,k,arr,dp)-k,f(i+1,0,k,arr,dp));
        }
    }
    public int maxProfit(int arr[], int k) {
        // Code here
        int n = arr.length;
        int dp[][] = new int[n][2];
        for(int ar[]:dp){
            Arrays.fill(ar,-1);
        }
        return f(0,1,k,arr,dp);
    }
}