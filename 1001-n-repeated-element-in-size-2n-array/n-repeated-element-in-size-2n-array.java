class Solution {
    public int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int c=1;
        for(int i=0;i<n-1;i++){
            if(nums[i]!=nums[i+1]){
                c=1;
            }else{
                c++;
                if(c>=n/2)return nums[i];
            }
        }
        if(c>=n/2)return nums[n-2];
        return nums[n-1];
    }
}