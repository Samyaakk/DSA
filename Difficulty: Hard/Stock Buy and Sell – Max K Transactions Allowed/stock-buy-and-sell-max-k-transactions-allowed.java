class Solution {
    // public static int f(int i,int tr,int k,int arr[],int dp[][]){
    //     if(i==arr.length )return 0;
    //     if(tr/2==k) return 0;
    //     if(dp[i][tr]!=-1)return dp[i][tr];
    //     if(tr%2==0){
    //         return dp[i][tr] = Math.max(-arr[i]+f(i+1,tr+1,k,arr,dp),f(i+1,tr,k,arr,dp));
    //     }else{
    //         return dp[i][tr] = Math.max(arr[i]+f(i+1,tr+1,k,arr,dp),f(i+1,tr,k,arr,dp));
    //     }
    // }
    
    static int maxProfit(int arr[], int k) {
        // code here
        int n = arr.length;
        // int dp[][] = new int[n][k*2];
        // for(int ar[]:dp){
        //     Arrays.fill(ar,-1);
        // }
        // return f(0,0,k,arr,dp);
        int after[] = new int[k*2+1];
        for(int i=n-1;i>=0;i--){
            int curr[] = new int[k*2+1];
            for(int tr=(k*2)-1;tr>=0;tr--){
                if(tr%2==0){
                    curr[tr] = Math.max(-arr[i]+after[tr+1],after[tr]);
                }else{
                    curr[tr] = Math.max(arr[i]+after[tr+1],after[tr]);
                }
            }
            after = curr;
        }
        return after[0];
    }
}