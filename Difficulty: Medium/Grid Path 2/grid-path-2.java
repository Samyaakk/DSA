// User function Template for Java

class Solution {
    public static int f(int i,int j,int grid[][],int dp[][]){
        if(i==0&&j==0)return 1;
        if(i<0 || j<0)return 0;
        if(grid[i][j]==1)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        int up = f(i-1,j,grid,dp);
        int left = f(i,j-1,grid,dp);
        return dp[i][j] = up+left;
    }
    public int totalWays(int N, int M, int grid[][]) {
        // Code here
        // int dp[][] = new int[N][M];
        // for(int arr[]:dp){
        //     Arrays.fill(arr,-1);
        // }
        // return f(N-1,M-1,grid,dp);
        //tab 
        if(grid[0][0]==1||grid[N-1][M-1]==1)return 0;
        int dp[][] = new int[N][M];
        for(int i=0;i<N;i++){
            if(grid[i][0]==0){
                dp[i][0] = 1;
            }else{
                break;
            }
        }
        for(int j=0;j<M;j++){
            if(grid[0][j]==0){
                dp[0][j] = 1;
            }else{
                break;
            }
        }
        for(int i=1;i<N;i++){
            for(int j=1;j<M;j++){
                if(grid[i][j]==1)dp[i][j] = 0;
                else{
                    int up = dp[i-1][j];
                    int left = dp[i][j-1];
                    dp[i][j] = up%(int)(1e9+7)+left%(int)(1e9+7);
                }
            }
        }
        return dp[N-1][M-1];
        
    }
}