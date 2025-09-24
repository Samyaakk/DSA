class Solution {
    static int lis(int arr[]) {
        // code here
        int dp[] = new int[arr.length];
        Arrays.fill(dp,1);
        int max=  0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i])dp[i] = Math.max(1+dp[j],dp[i]);
            }
            max = Math.max(dp[i],max);
        }
        return max;
    }
}