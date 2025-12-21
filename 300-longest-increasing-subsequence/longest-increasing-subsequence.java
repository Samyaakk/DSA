class Solution {
    public int lcs(int arr1[],int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        int dp[][] = new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                int take = 0;
                int notTake = 0;
                if(arr1[i-1]==arr2[j-1]){
                    take = 1+dp[i-1][j-1];
                }else{
                    notTake = Math.max(dp[i-1][j],dp[i][j-1]);
                }
                dp[i][j] = Math.max(take,notTake);
            }
        }
        return dp[n][m];
    }
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int i:nums)set.add(i);
        int arr[] = new int[set.size()];
        int k = 0;
        for(int i:set){
            arr[k++]=i;
        }
        Arrays.sort(arr);
        return lcs(nums,arr);
    }
}