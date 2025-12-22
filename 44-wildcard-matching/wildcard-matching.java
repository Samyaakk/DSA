class Solution {
    public int f(int i,int j,String s1,String s2,int dp[][]){
        if(i<0 && j<0)return 1;
        if(i>=0 && j<0)return 0;
        if(i<0 && j>=0){
            StringBuilder sb = new StringBuilder(s2.substring(0,j+1));
            for(int k=0;k<sb.length();k++){
                if(sb.charAt(k)!='*')return 0;
            }
            return 1;
        }
        if(dp[i][j]!=-1)return dp[i][j];
        if(s2.charAt(j)=='?' || s1.charAt(i)==s2.charAt(j) ){
            return dp[i][j] = f(i-1,j-1,s1,s2,dp);
        }
        if(s2.charAt(j)=='*'){
            return dp[i][j] = f(i-1,j,s1,s2,dp)|f(i,j-1,s1,s2,dp);
        }
        return dp[i][j] = 0;
    }
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        int dp[][] = new int[n+1][m+1];
        // for(int arr[]:dp){
        //     Arrays.fill(arr,-1);
        // }
        // return (f(n-1,m-1,s,p,dp)==1)?true:false;
        // dp[0][0] = 1;
        // for(int j=1;j<m+1;j++){
        //     if(p.charAt(j-1)=='*')dp[0][j]= 1;
        //     else break;
        // }
        int prev[] = new int[m+1];
        prev[0] = 1;
        for(int j=1;j<=m;j++){
            if(p.charAt(j-1)=='*')prev[j]=1;
            else break;
        }
        for(int i=1;i<=n;i++){
            int curr[] = new int[m+1];
            for(int j=1;j<=m;j++){
                if(s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='?'){
                    curr[j] = prev[j-1];
                }
                if(p.charAt(j-1)=='*'){
                    curr[j] = prev[j] | curr[j-1];
                }
            }
            prev = curr;
        }
        return prev[m]==1?true:false;
    }
}