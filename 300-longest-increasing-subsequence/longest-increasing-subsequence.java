class Solution {
    public int f(int i,int prev,int arr[],int dp[][]){
        if(i<0)return 0;
        int take = 0;
        int notTake = 0;
        if(prev!=-1 && dp[i][prev]!=-1)return dp[i][prev];
        if(prev == -1||arr[i]<arr[prev]){
            take = Math.max(1+f(i-1,i,arr,dp),f(i-1,prev,arr,dp));
        }else{
            notTake = f(i-1,prev,arr,dp);
        }
        if(prev==-1)prev=0;
        return dp[i][prev] = Math.max(take,notTake);
    }
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int dp[][] = new int[n+1][n+1];
        for(int arr[]:dp){
            Arrays.fill(arr,-1);
        }
        return f(n-1,-1,nums,dp);
    }
}