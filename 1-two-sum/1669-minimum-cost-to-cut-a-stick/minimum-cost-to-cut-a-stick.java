class Solution {
    public int f(int i,int j,int arr[],int dp[][]){
        //bc 
        if(i>j)return 0;
        // poss 
        if(dp[i][j]!=-1)return dp[i][j];
        int minCost = Integer.MAX_VALUE;
        for(int k=i;k<=j;k++){
            int cost = arr[j+1]-arr[i-1] + f(i,k-1,arr,dp) + f(k+1,j,arr,dp);
            minCost = Math.min(cost,minCost);
        }
        return dp[i][j] = minCost;
    }
    public int minCost(int n, int[] cuts) {
        Arrays.sort(cuts);
        int ne = cuts.length;
        int arr[] = new int[ne+2];
        // int dp[][] = new int[ne+2][ne+2];
        // for(int ar[]:dp){
        //     Arrays.fill(ar,-1);
        // }
        for(int i=1;i<ne+1;i++){
            arr[i] = cuts[i-1];
        }
        arr[0] = 0;
        arr[ne+1] = n; 
        // return f(1,ne,arr,dp);
        int dp[][] = new int[ne+2][ne+2];
        for(int i=ne;i>0;i--){
            for(int j=1;j<=ne;j++){
                if(i>j)continue;//bc 
                int minCost = Integer.MAX_VALUE;
                for(int k=i;k<=j;k++){
                    int cost = arr[j+1]-arr[i-1] + dp[i][k-1] + dp[k+1][j];
                    minCost = Math.min(cost,minCost);
                }
                dp[i][j] = minCost;
            }
        }
        return dp[1][ne];
    }
}