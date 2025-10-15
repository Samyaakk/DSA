class Solution {
    public int f(int i,int j,String s1,String s2,int dp[][]){
        if(i<0 || j<0)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j] = 1+f(i-1,j-1,s1,s2,dp);
        }else{
            return dp[i][j] = Math.max(f(i-1,j,s1,s2,dp),f(i,j-1,s1,s2,dp));
        }
    }
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int dp[][] = new int[n][m];
        for(int arr[]:dp){
            Arrays.fill(arr,-1);
        }
        int lcs = f(n-1,m-1,word1,word2,dp);
        return n+m-(2*lcs);
    }
}