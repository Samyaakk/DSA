class Solution {
    List<Integer> res = new ArrayList<>();
    public int f(int i,int p,int nums[],int dp[][]){
        if(i==nums.length)return 0;
        //poss
        if(dp[i][p+1]!=-1)return dp[i][p+1];
        int notTake = f(i+1,p,nums,dp);
        int take = 0;
        if(p==-1||nums[i]%nums[p]==0||nums[p]%nums[i]==0){
            res.add(nums[i]);
            take = 1+f(i+1,i,nums,dp);
        }
        return dp[i][p+1] = Math.max(take,notTake);
    }
    public List<Integer> largestDivisibleSubset(int[] nums) {
        // int n = nums.length;
        // int dp[][] = new int[nums.length][nums.length+1];
        // for(int arr[]:dp){
        //     Arrays.fill(arr,-1);
        // }
        // int size = f(0,-1,nums,dp);
        // System.out.println(size);
        // return res;
        
        // int dp[][] = new int[n+1][n+2];
        // for(int i=n-2;i>=0;i--){
        //     for(int p=-1;p<n;p++){
        //         int notTake = dp[i][p+1];
        //         int take = 0;
        //         if(p==-1||nums[i]%nums[p]==0||nums[p]%nums[i]==0){
        //             res.add(nums[i]);
        //             take = 1+dp[i+1][i];
        //         }
        //         dp[i][p+1] = Math.max(take,notTake);
        //     }
        // }
        // System.out.println(dp[0][0]);
        // return res;
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp,1);
        int hash[] = new int[n];
        for(int i=0;i<n;i++){
            hash[i] = i;
        }
        Arrays.sort(nums);
        int max =0;
        int lastIdx = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0 || nums[j]%nums[i]==0){
                    if(dp[i]<1+dp[j]){
                        dp[i] = dp[j]+1;
                        hash[i] = j;
                    }
                }
            }
            if(dp[i]>max){
                max = dp[i];
                lastIdx = i;
            }
        }
        List<Integer> res = new ArrayList<>();
        res.add(nums[lastIdx]);
        while(hash[lastIdx]!=lastIdx){
            lastIdx = hash[lastIdx];
            res.add(nums[lastIdx]);
        }
        //we can rev as well ot maintain the order but that's fine .. 
        return res;
    }
}