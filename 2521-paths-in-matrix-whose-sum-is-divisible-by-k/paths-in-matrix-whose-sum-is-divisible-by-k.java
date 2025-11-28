class Solution {
    int MOD = (int)1e9 + 7;
    public int f(int i,int j,int sum,int n,int m,int k,int grid[][],int dp[][][]){
        //base case 
        if(i==n && j==m){
            sum = (sum+grid[i][j])%k;
            if(sum%k==0)return 1;
            else return 0;
        }
        if(i>n || j>m)return 0;
        if(dp[i][j][sum]!=-1)return dp[i][j][sum];
        //right + down 
        int right = f(i,j+1,(sum+grid[i][j])%k,n,m,k,grid,dp);
        int down = f(i+1,j,(sum+grid[i][j])%k,n,m,k,grid,dp);
        //return 
        return dp[i][j][sum] = (right+down)%MOD;
    }
    public int numberOfPaths(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int dp[][][] = new int[n][m][k];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return f(0,0,0,n-1,m-1,k,grid,dp);
    }
}