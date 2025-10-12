class Solution {
    // public int f(int i,int j,String text1,String text2,int dp[][]){
    //     if(i<0 || j<0)return 0;
    //     if(dp[i][j]!=-1)return dp[i][j];
    //     if(text1.charAt(i)==text2.charAt(j)){
    //         return dp[i][j] = 1+f(i-1,j-1,text1,text2,dp);
    //     }else{
    //         return dp[i][j] = Math.max(f(i-1,j,text1,text2,dp),f(i,j-1,text1,text2,dp));
    //     }
    // }
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        // int dp[][] = new int[n][m];
        // for(int arr[]:dp){
        //     Arrays.fill(arr,-1);
        // }
        // return f(n-1,m-1,text1,text2,dp);
        int prev[] = new int[m+1];
        for(int i=1;i<=n;i++){
            int curr[] = new int[m+1];
            for(int j=1;j<=m;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    curr[j] = 1+prev[j-1];
                }else{
                    curr[j] = Math.max(prev[j],curr[j-1]);
                }
            }
            prev = curr;
        }
        return prev[m];
    }
}