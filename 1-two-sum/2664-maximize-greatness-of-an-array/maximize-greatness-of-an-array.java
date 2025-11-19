class Solution {
    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = 0;
        int c = 0;
        int n = nums.length;
        while(i<n && j<n){
            if(nums[j]>nums[i]){
                i++;
                j++;
                c++;
            }else{
                j++;
            }
        }
        return c;
    }
}