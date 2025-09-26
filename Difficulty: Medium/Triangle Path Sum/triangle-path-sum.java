// User function Template for Java

class Solution {
    public int f(int i,int j,int mat[][],int dp[][]){
        if(i==0)return mat[0][0];
        if(dp[i][j]!=-1)return dp[i][j];
        int up = (int)1e9;
        int dleft = (int)1e9;
        if( i-1>=0&&j<=i)up = mat[i][j] + f(i-1,j,mat,dp);
        if(i-1>=0 && j-1>=0 && j<=i)dleft = mat[i][j] + f(i-1,j-1,mat,dp);
        return dp[i][j] = Math.min(up,dleft);
    }
    public int minPathSum(ArrayList<ArrayList<Integer>> triangle) {
        // Code here
        int n = triangle.size();
        int mat[][] = new int[n][n];
        for(int arr[]:mat){
            Arrays.fill(arr,-1);
        }
        for(int i=0;i<triangle.size();i++){
            for(int j=0;j<triangle.get(i).size();j++){
                mat[i][j] = triangle.get(i).get(j);
            }
        }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.print(mat[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        int dp[][] = new int[n][n];
        for(int arr[]:dp){
            Arrays.fill(arr,-1);
        }
        int min = Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            min = Math.min(f(n-1,j,mat,dp),min);
        }
        return min;
        // int dp[][] = new int[n][n];
        // dp[0][0] = mat[0][0];
        // for(int i=1;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         int up = Integer.MAX_VALUE;
        //         int dleft = Integer.MAX_VALUE;
        //         if(i-1>=0)up = mat[i][j] + dp[i-1][j];
        //         if(i-1>=0 && j-1>=0)dleft = mat[i][j] + dp[i-1][j-1];
        //         dp[i][j] = Math.min(up,dleft);
        //     }
        // }
        // int min = Integer.MAX_VALUE;
        // for(int j=0;j<n;j++){
        //     min = Math.min(dp[n-1][j],min);
        // }
        // return min;
    }
}