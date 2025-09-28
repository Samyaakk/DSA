// User function Template for Java

class Solution {
    public int f(int i,int j,String s1,String s2,int dp[][]){
        if(i<0 || j<0)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        int take  =0;
        int notTake = 0;
        if(s1.charAt(i)==s2.charAt(j)){
            take = 1+f(i-1,j-1,s1,s2,dp);
        }else{
            notTake = Math.max(f(i-1,j,s1,s2,dp),f(i,j-1,s1,s2,dp));
        }
        return dp[i][j] = Math.max(take,notTake);
    }
    public int longestPalinSubseq(String s) {
        // code here
        String s1 = new String(s);
        StringBuilder sb = new StringBuilder(s);
        sb=  sb.reverse();
        int n  =s1.length();
        String s2 =  new String(sb);
        int dp[][] = new int[n+1][n+1];
        for(int arr[]:dp){
            Arrays.fill(arr,-1);
        }
        return f(n-1,n-1,s1,s2,dp);
        
    }
}