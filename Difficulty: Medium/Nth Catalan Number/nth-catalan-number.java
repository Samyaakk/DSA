
class Solution {
    public static int rec(int n,int dp[]){
        if(n==0||n==1)return 1;
        int ans = 0;
        if(dp[n]!=-1)return dp[n];
        for(int i=0;i<=n-1;i++){
            ans += rec(i,dp)*rec(n-i-1,dp);
        }
        return dp[n] = ans;
    }
    public static int findCatalan(int n) {
        // code here
        int dp[] = new int[n+1];
        // Arrays.fill(dp,-1);
        // return rec(n,dp);
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            int ans = 0;
            for(int j=0;j<i;j++){
                ans+=dp[j]*dp[i-j-1];
            }
            dp[i] = ans;
        }
        // for(int i=0;i<n;i++){
        //     System.out.print(dp[i]+" ");
        // }
        return dp[n];
    }
}
