class Solution {
    public int findFinalValue(int[] nums, int original) {
        int c= 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==original){
                c++;
            }
        }
        if(c==0)return original;
        while(true){
            int x=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==original){
                    x++;
                    original = nums[i]*2;
                    break;
                }
            }
            if(x==0)return original;
        }
        // return -1;
    }
}