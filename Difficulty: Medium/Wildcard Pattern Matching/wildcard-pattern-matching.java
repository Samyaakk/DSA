class Solution {
    public int f(int i,int j,String s1,String s2,int dp[][]){
        //poss
        if(i<0 && j<0)return 1;
        else if(i<0 && j>=0){
            for(int k=0;k<=j;k++){
                if(s2.charAt(k)!='*')return 0;
            }
            return 1;
        }else if(i>=0 && j<0){
            return 0;
        }
        if(dp[i][j]!=-1)return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)||s2.charAt(j)=='?'){
            return dp[i][j] = f(i-1,j-1,s1,s2,dp);
        }else if(s2.charAt(j)=='*'){
            return dp[i][j] = f(i-1,j,s1,s2,dp) | f(i,j-1,s1,s2,dp);
        }
        return 0;
    }
    public boolean wildCard(String s1, String s2) {
        // Your code goes here
        int n = s1.length();
        int m  = s2.length();
        int dp[][] = new int[n+1][m+1];
        for(int arr[]:dp){
            Arrays.fill(arr,-1);
        }
        int x = f(n-1,m-1,s1,s2,dp);
        if(x==1)return true;
        return false;
    }
}