class Solution {
    public int f(int idx,int arr[],int dp[]){
        if(idx==0)return arr[0];
        if(idx==1)return Math.max(arr[0],arr[1]);
        if(dp[idx]!=-1)return dp[idx];
        int take = arr[idx]+f(idx-2,arr,dp);
        int notTake = f(idx-1,arr,dp);
        return dp[idx] = Math.max(take,notTake);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return f(n-1,nums,dp);
    }
}