class Solution {
    public int f(int i,int j,String s1,String s2,int dp[][]){
        if(i<0||j<0)return 0;
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j] = 1+f(i-1,j-1,s1,s2,dp);
        }else{
            return dp[i][j] = Math.max(f(i-1,j,s1,s2,dp),f(i,j-1,s1,s2,dp));
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n1 = text1.length();
        int n2 = text2.length();
        // int dp[][] = new int[n1+1][n2+1];
        // for(int arr[]:dp){
        //     Arrays.fill(arr,-1);
        // }
        // return f(n1-1,n2-1,text1,text2,dp);
        int prev[] = new int[n2+1];
        for(int i=1;i<=n1;i++){
            int curr[] = new int[n2+1];
            for(int j=1;j<=n2;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    curr[j] = 1+prev[j-1];
                }else{
                    curr[j] = Math.max(curr[j-1],prev[j]);
                }
            }
            prev = curr;
        }
        return prev[n2];
    }
}