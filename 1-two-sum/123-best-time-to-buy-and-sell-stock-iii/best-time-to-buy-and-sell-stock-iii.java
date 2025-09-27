class Solution {
    public int f(int i,int tr,int arr[],int dp[][]){
        if(i==arr.length || tr==4)return 0;
        if(dp[i][tr]!=-1)return dp[i][tr];
        if(tr%2==0){
            return dp[i][tr] = Math.max(-arr[i]+f(i+1,tr+1,arr,dp),f(i+1,tr,arr,dp));
        }else{
            return dp[i][tr] = Math.max(arr[i]+f(i+1,tr+1,arr,dp),f(i+1,tr,arr,dp));
        }
    }
    public int maxProfit(int[] arr) {
        int n = arr.length;
        // int dp[][] = new int[n][4];
        // for(int ar[]:dp){
        //     Arrays.fill(ar,-1);
        // }
        // return f(0,0,arr,dp);
        int dp[][] = new int[n+1][5];
        for(int i=n-1;i>=0;i--){
            for(int tr=3;tr>=0;tr--){
                if(tr%2==0){
                    dp[i][tr] = Math.max(-arr[i]+dp[i+1][tr+1],dp[i+1][tr]);
                }else{
                    dp[i][tr] = Math.max(arr[i]+dp[i+1][tr+1],dp[i+1][tr]);
                }
            }
        }
        return dp[0][0];
        // you can do space optimizaiton yr 
    }
}