// User function Template for Java

class Solution {
    // static int f(int i,int cap,int val[],int wt[],int C,int dp[][]){
    //     if(i==val.length)return 0;
    //     if(dp[i][cap]!=-1)return dp[i][cap];
    //     int v1 = 0;
    //     int v2 = 0;
    //     if(cap+wt[i]<=C){
    //         int x  = val[i] + f(i,cap+wt[i],val,wt,C,dp);
    //         int y = val[i] + f(i+1,cap+wt[i],val,wt,C,dp);
    //         int z = Math.max(x,y);
    //         v1 = Math.max(z,f(i+1,cap,val,wt,C,dp));
    //     }else{
    //         v2 = f(i+1,cap,val,wt,C,dp);
    //     }
    //     return dp[i][cap] = Math.max(v1,v2);
    // }
    static int knapSack(int val[], int wt[], int capacity) {
        // code here
        int n = val.length;
        // int dp[][] = new int[n][capacity+1];
        // for(int arr[]:dp){
        //     Arrays.fill(arr,-1);
        // }
        // return f(0,0,val,wt,capacity,dp);
        int after[] = new int[capacity+1];
        for(int i=n-1;i>=0;i--){
            int curr[] = new int[capacity+1];
            for(int j=capacity;j>=0;j--){
                int v1 = 0;
                int v2 = 0;
                if(j+wt[i]<=capacity){
                    int x  = val[i] + curr[j+wt[i]];
                    int y = val[i] + after[j+wt[i]];
                    int z = Math.max(x,y);
                    v1 = Math.max(z,after[j]);
                }else{
                    v2 = after[j];
                }
                curr[j] = Math.max(v1,v2);
            }
            after = curr;
        }
        return after[0];
    }
}