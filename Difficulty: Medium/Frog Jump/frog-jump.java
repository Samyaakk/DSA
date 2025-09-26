// User function Template for Java
class Solution {
    public int f(int i,int arr[],int dp[]){
        if(i==0)return 0;
        if(i==1)return Math.abs(arr[i]-arr[0]);
        //poss 
        if(dp[i]!=-1)return dp[i];
        int j1 = (int)1e9;
        int j2 = (int)1e9;
        if(i-1>=0) j1 = Math.abs(arr[i]-arr[i-1])+f(i-1,arr,dp);
        if(i-2>=0)j2 = Math.abs(arr[i]-arr[i-2])+f(i-2,arr,dp);
        return dp[i] = Math.min(j1,j2);
    }
    int minCost(int[] arr) {
        // code here  
        int n = arr.length;
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        return f(n-1,arr,dp);
        //tab
        // int n = arr.length;
        // int dp[] = new int[n];
        // dp[0] = 0;
        // dp[1] = Math.abs(arr[1]-arr[0]);
        // for(int i=2;i<n;i++){
        //     int j1 = (int)1e9;
        //     int j2 = (int)1e9;
        //     if(i-1>=0) j1 = Math.abs(arr[i]-arr[i-1])+dp[i-1];
        //     if(i-2>=0)j2 = Math.abs(arr[i]-arr[i-2])+dp[i-2];
        //     dp[i] = Math.min(j1,j2);
        // }
        // return dp[n-1];
        //space opt
        // int n = arr.length;
        // int prev2 = 0;
        // int prev = Math.abs(arr[1]-arr[0]);
        // for(int i=2;i<n;i++){
        //     int j1 = (int)1e9;
        //     int j2 = (int)1e9;
        //     if(i-1>0) j1 = Math.abs(arr[i]-arr[i-1])+prev;
        //     if(i-2>0)j2 = Math.abs(arr[i]-arr[i-2])+prev2;
        //     int curr = Math.min(j1,j2);
        //     prev2 = prev;
        //     prev = curr;
        // }
        // return prev;
    }
}