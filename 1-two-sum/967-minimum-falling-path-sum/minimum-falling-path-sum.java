class Solution {
    public int f(int i,int j,int mat[][]){
        if(i==0)return mat[0][j];
        int up = Integer.MAX_VALUE;
        int dl = Integer.MAX_VALUE;
        int dr = Integer.MAX_VALUE;
        if(i-1>=0)up = f(i-1,j,mat);
        if(i-1>=0 && j-1>=0)dl = f(i-1,j-1,mat);
        if(i-1>=0 && j+1<mat.length)dr = f(i-1,j+1,mat);
        int x  =Math.min(up,dl);
        int y = Math.min(x,dr);
        return mat[i][j] + y;
    }
    public int minFallingPathSum(int[][] mat) {
        int n = mat.length;
        // int min = Integer.MAX_VALUE;
        // for(int j=0;j<n;j++){
        //     min = Math.min(min,f(n-1,j,mat));
        // }
        // return min;
        int dp[][] = new int[n][n];
        for(int j=0;j<n;j++){
            dp[0][j] = mat[0][j];
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                int up = Integer.MAX_VALUE;
                int dl = Integer.MAX_VALUE;
                int dr = Integer.MAX_VALUE;
                if(i-1>=0)up = dp[i-1][j];
                if(i-1>=0 && j-1>=0)dl = dp[i-1][j-1];
                if(i-1>=0 && j+1<mat.length)dr = dp[i-1][j+1];
                int x  =Math.min(up,dl);
                int y = Math.min(x,dr);
                dp[i][j] = mat[i][j] + y;
            }
        }
        int min = Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            min = Math.min(min,dp[n-1][j]);
        }
        return min;
        //we can space optimize it ttoo .. .
    }
}