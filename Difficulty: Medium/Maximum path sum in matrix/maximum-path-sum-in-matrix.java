// User function Template for Java
class Solution {
    
        public int f(int i,int j,int mat[][],int dp[][]){
            if(i==0)return mat[0][j];
            if(dp[i][j]!=-1)return dp[i][j];
            int up = 0;
            int dleft = 0;
            int dright = 0;
            if(i-1>=0)up = mat[i][j]+ f(i-1,j,mat,dp);
            if(i-1>=0 && j-1>=0)dleft = mat[i][j]+ f(i-1,j-1,mat,dp);
            if(i-1>=0 && j+1<mat[0].length)dright =mat[i][j]+  f(i-1,j+1,mat,dp);
            int x = Math.max(up,dleft);
            int y = Math.max(x,dright);
            return dp[i][j] = y;
        }
    public int maximumPath(int[][] mat) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        int max=  0;
        int dp[][] = new int[n][m];
        for(int arr[]:dp){
            Arrays.fill(arr,-1);
        }
        for(int j=0;j<m;j++){
            max = Math.max(max,f(n-1,j,mat,dp));
        }
        return max;
    }
}