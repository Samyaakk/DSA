class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int c = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)c++;
        }
        if(c<=1)return true;
        c = 0;
        int idx = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                idx = i;
                break;
            }
        }
        for(int i=idx+1;i<nums.length;i++){
            if(nums[i]==0){
                c++;
            }else{
                if(c<k)return false;
                c=0;
            }

        }
        return true;
    }
}