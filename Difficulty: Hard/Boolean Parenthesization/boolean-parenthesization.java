// User function Template for Java
class Solution {
    static int f(int i,int j,String s,int isTrue,int dp[][][]){
        if(i>j)return 0;
        if(i==j){
            if(isTrue==1){
                return s.charAt(i)=='T'?1:0;
            }else{
                return s.charAt(i)=='F'?1:0;
            }
        }
        if(dp[i][j][isTrue]!=-1)return dp[i][j][isTrue];
        int ways = 0;
        for(int k=i+1;k<=j-1;k+=2){
            int lt = f(i,k-1,s,1,dp);
            int rt = f(k+1,j,s,1,dp);
            int lf = f(i,k-1,s,0,dp);
            int rf = f(k+1,j,s,0,dp);
            if(s.charAt(k)=='&'){
                if(isTrue==1){
                    ways +=  lt*rt;
                }else{
                    ways += lf*rt+rf*lt+rf*lf;
                }
            }else if(s.charAt(k)=='^'){
                if(isTrue==1){
                    ways += lt*rf+rt*lf;
                }else{
                    ways += lt*rt+lf*rf;
                } 
            }else{
                if(isTrue==1){
                    ways += lt*rt+lt*rf+lf*rt;
                }else{
                    ways += lf*rf;
                }
            }
        }
        return dp[i][j][isTrue] = ways;
    }
    static int countWays(String s) {
        // code here
        int n = s.length();
        int dp[][][] = new int[n][n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<2;k++){
                    dp[i][j][k] = -1;
                }
            }
        }
        return f(0,n-1,s,1,dp);
        // int dp[][][] = new int[n+1][n+1][3];
        // for(int i=n-1;i>=0;i--){
        //     for(int j=1;j<=n;j++){
        //         for(int w=0;w<2;w++){
        //             int ways = 0;
        //             for(int k=i+1;k<=j-1;k+=2){
        //                 int lt = dp[i][k-1][1];
        //                 int rt = dp[k+1][j][1];
        //                 int lf = dp[i][k-1][0];
        //                 int rf = dp[k+1][j][0];
        //                 if(s.charAt(k)=='&'){
        //                     if(w==1){
        //                         ways +=  lt*rt;
        //                     }else{
        //                         ways += lf*rt+rf*lt+rf*lf;
        //                     }
        //                 }else if(s.charAt(k)=='^'){
        //                     if(w==1){
        //                         ways += lt*rf+rt*lf;
        //                     }else{
        //                         ways += lt*rt+lf*rf;
        //                     } 
        //                 }else{
        //                     if(w==1){
        //                         ways += lt*rt+lt*rf+lf*rt;
        //                     }else{
        //                         ways += lf*rf;
        //                     }
        //                 }
        //             }
        //             dp[i][j][w] = ways;
        //         }
        //     }
        // }
        // return dp[0][n-1][1];
    }
}