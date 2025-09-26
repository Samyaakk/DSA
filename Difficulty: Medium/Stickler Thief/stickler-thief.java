class Solution {
    public int f(int i,int arr[],int dp[]){
        if(i==0)return arr[0];
        //poss
        if(dp[i]!=-1)return dp[i];
        int notTake = f(i-1,arr,dp);
        int take = 0;
        if(i-2>=0)take = arr[i]+f(i-2,arr,dp);
        return dp[i] = Math.max(take,notTake);
    }
    public int findMaxSum(int arr[]) {
        // code here
        int n  =arr.length;
        // int dp[] = new int[n];
        // Arrays.fill(dp,-1);
        // return f(n-1,arr,dp);
        //tab
        // int dp[] = new int[n];
        // dp[0] = arr[0];
        // if(n>1)dp[1] = Math.max(arr[0],arr[1]);
        // else return arr[0];
        // for(int i=2;i<n;i++){
        //     int nt = dp[i-1];
        //     int t = 0;
        //     if(i-2>=0)t = arr[i]+dp[i-2];
        //     dp[i] = Math.max(t,nt);
        // }
        // return dp[n-1];
        //sapce opt 
        int prev2 = arr[0];
        int prev =0;
        if(n>1)prev = Math.max(arr[0],arr[1]);
        else return arr[0];
        for(int i=2;i<n;i++){
            int nt = prev;
            int t = 0;
            if(i-2>=0)t = arr[i]+prev2;
            int curr = Math.max(t,nt);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
}