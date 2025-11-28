class Solution {
    int MOD =(int)1e9 + 7;
    public int f(int i,int j,int n,int m,int k,int rem,int grid[][],int dp[][][]){
        rem = (rem + grid[i][j]) % k;   // FIX 1: use remainder only

        // base case
        if (i == n && j == m) {
            return rem == 0 ? 1 : 0;
        }

        // out of bounds
        if (i > n || j > m) return 0;

        // FIX 2: memoize using rem, not k
        if (dp[i][j][rem] != -1) 
            return dp[i][j][rem];

        int right = 0, down = 0;

        if (j + 1 <= m)
            right = f(i, j + 1, n, m, k, rem, grid, dp);

        if (i + 1 <= n)
            down = f(i + 1, j, n, m, k, rem, grid, dp);

        return dp[i][j][rem] = (right + down) % MOD;
        // if(i>n || j>m)return 0;
        // sum = (sum+grid[i][j])%k;
        // if(i==n && j==m){
        //     return (sum==0)?1:0; 
        // }
        // if(dp[i][j][sum]!=-1)return dp[i][j][sum];
        // int right = f(i,j+1,n,m,k,sum+grid[i][j],grid,dp);
        // int down = f(i+1,j,n,m,k,sum+grid[i][j],grid,dp);
        // return dp[i][j][sum] = ((((right)%MOD + (down)%MOD))%MOD);
    }
    public int numberOfPaths(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int dp[][][] = new int[n][m][k+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        // long MOD =(long) 1e9+7;
        return f(0,0,n-1,m-1,k,0,grid,dp);
    }
}