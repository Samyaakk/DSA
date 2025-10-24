class Solution {
    public int missingMultiple(int[] nums, int k) {
        for(int i=1;i<=100;i++){
            if(i%k==0){
                int c=0;
                for(int j=0;j<nums.length;j++){
                    if(nums[j]==i){
                        c++;
                    }
                }
                if(c==0)return i;
            }
        }
        int s=1;
        int res = 1;
        while(res<=100){
            res=k*s;
            s++;
        }
        return res;
    }
}