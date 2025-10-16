class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max =0;
        int c=0;
        if(nums.length==0)return 0;
        if(nums.length==1)return 1;
        for(int i=1;i<nums.length;i++){
            if(Math.abs(nums[i]-nums[i-1])==1){
                c++;
            }else if(Math.abs(nums[i]-nums[i-1])<1){
                continue;
            }else{
                c=0;
            }
            max = Math.max(max,c);
        }
        // if(max==0)return 0;
        return max+1;
    }
}