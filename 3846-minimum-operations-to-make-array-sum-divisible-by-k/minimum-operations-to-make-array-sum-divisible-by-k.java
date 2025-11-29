class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for(int i:nums){
            sum+=i;
        }
        int mod = sum%k;
        if(mod==0)return 0;
        for(int i:nums){
            if(i%k==mod){
                return mod;
            }
        }
        return sum%k;
    }
}