class Solution {
    public int f(int i,int b,int c,int arr[],int dp[][][]){
        if(i==arr.length)return 0;
        if(c==2)return 0;
        if(dp[i][b][c]!=-1)return dp[i][b][c];
        if(b==0){
            return dp[i][b][c] = Math.max(-arr[i]+f(i+1,1,c,arr,dp),f(i+1,0,c,arr,dp));
        }else{
            return dp[i][b][c] = Math.max(arr[i]+f(i+1,0,c+1,arr,dp),f(i+1,1,c,arr,dp));
        }
    }
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int dp[][][] = new int[n][2][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<2;k++){
                    dp[i][j][k] = -1;
                }
            }
        }
        return f(0,0,0,prices,dp);
    }
}
// class Solution {
//     public int f(int i,int b,int k,int arr[]){
//         if(i==arr.length)return 0;
//         if(k==0)return 0;
//         if(b==0){
//             return Math.max(-arr[i]+f(i+1,1,k,arr),f(i+1,0,k,arr));
//         }else{
//             k--;
//             return Math.max(arr[i]+f(i+1,0,k,arr),f(i+1,1,k,arr));
//         }
//     }
//     public int maxProfit(int[] prices) {
//         return f(0,0,2,prices);
//     }
// }