class Solution {
    public int f(int i,int j,int arr[],int dp[][]){
        if(i>j)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        int max = Integer.MIN_VALUE;
        for(int k=i;k<=j;k++){
            int coins = arr[i-1]*arr[k]*arr[j+1] + f(i,k-1,arr,dp) + f(k+1,j,arr,dp);
            max = Math.max(max,coins);
        }
        return dp[i][j] = max;
    }
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int arr[] = new int[nums.length+2];
        for(int i=1;i<=nums.length;i++){
            arr[i] = nums[i-1];
        }
        arr[0] = 1;
        arr[arr.length-1] = 1;
        int dp[][] = new int[n+2][n+2];
        for(int ar[]:dp){
            Arrays.fill(ar,-1);
        }
        return f(1,n,arr,dp);
    }
}