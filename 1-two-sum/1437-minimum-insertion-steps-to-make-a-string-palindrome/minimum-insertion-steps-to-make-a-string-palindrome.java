class Solution {
    // public int f(int i,int j,String s1,String s2,int dp[][]){
    //     if(i<0 || j<0)return 0;
    //     if(dp[i][j]!=-1)return dp[i][j];
    //     if(s1.charAt(i)==s2.charAt(j)){
    //         return dp[i][j] = 1+f(i-1,j-1,s1,s2,dp);
    //     }else{
    //         return dp[i][j] = Math.max(f(i-1,j,s1,s2,dp),f(i,j-1,s1,s2,dp));
    //     }
    // }
    public int minInsertions(String s) {
        String s1 = s;
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        String s2 = new String(sb);
        // int dp[][] = new int[n][n];
        // for(int arr[]:dp){
        //     Arrays.fill(arr,-1);
        // }
        // int lcs = f(n-1,n-1,s1,s2,dp);
        // return n-lcs;
        // int dp[][] = new int[n+1][n+1];
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //        if(s1.charAt(i-1)==s2.charAt(j-1)){
        //             dp[i][j] = 1+dp[i-1][j-1];
        //         }else{
        //             dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
        //         } 
        //     }
        // }
        // return n-dp[n][n];
        int prev[] = new int[n+1];
        for(int i=1;i<=n;i++){
            int curr[] = new int[n+1];
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    curr[j] = 1+prev[j-1];
                }else{
                    curr[j] = Math.max(prev[j],curr[j-1]);
                }
            }
            prev =curr;
        }
        return n - prev[n];
    }
}