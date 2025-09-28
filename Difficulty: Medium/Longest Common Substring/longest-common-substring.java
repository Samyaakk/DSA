// User function Template for Java

class Solution {
    public int longestCommonSubstr(String s1, String s2) {
        // code here
        int n =s1.length();
        int m  =s2.length();
        int prev[] = new int[m+1];
        int max = 0;
        for(int i=1;i<=n;i++){
            int curr[] = new int[m+1];
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    int x = 1+prev[j-1];
                    max = Math.max(max,x);
                    curr[j] = x;
                }
            }
            prev = curr;
        }
        return max;
    }
}