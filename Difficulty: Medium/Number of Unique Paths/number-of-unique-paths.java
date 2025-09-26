// User function Template for Java

class Solution {
    // Function to find total number of unique paths.
    // public static int f(int i,int j,int dp[][]){
    //     if(i==0&&j==0)return 1;
    //     if(i<0 || j<0)return 0;
    //     if(dp[i][j]!=-1)return dp[i][j];
    //     int up = f(i-1,j,dp);
    //     int left = f(i,j-1,dp);
    //     return dp[i][j] = up+left;
    // }
    public static int NumberOfPath(int a, int b) {
        // Your code here
        // int dp[][] = new int[a][b];
        // for(int arr[]:dp){
        //     Arrays.fill(arr,-1);
        // }
        // return f(a-1,b-1,dp);
        //tab 
        // int dp[][] = new int[a][b];
        //space optimization 
        int prev[] = new int[b];
        // for(int i=0;i<a;i++){
        //     dp[i][0] = 1;
        // }
        for(int j=0;j<b;j++){
            prev[j] = 1;
        }
        for(int i=1;i<a;i++){
            int curr[] = new int[b];
            curr[0] = 1;
            for(int j=1;j<b;j++){
                    int up = 0;
                    int left = 0;
                    if(i-1>=0)up = prev[j];
                    if(j-1>=0)left = curr[j-1];
                    curr[j] = up+left;
            }
            prev = curr;
        }
        return prev[b-1];
    }
}