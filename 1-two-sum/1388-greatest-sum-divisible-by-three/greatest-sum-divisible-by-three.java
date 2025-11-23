class Solution {
    
    public int maxSumDivThree(int[] nums) {
        int n = nums.length;
        int sum= 0;
        Arrays.sort(nums);
        for(int i:nums){
            sum+=i;
        }
        if(sum%3==0){
            return sum;
        }else if(sum%3==1){
            int x = 0;
            int y = 0;
            for(int i=0;i<n;i++){
                if(nums[i]%3==1){
                    x=nums[i];
                    break;
                }
            }
            int c=0;
            for(int i=0;i<n;i++){
                if(nums[i]%3==2){
                    c++;
                    y+=nums[i];
                    if(c==2)break;
                }
            }
            if(x>0 && y>0){
                if(c==2){
                    return sum-=Math.min(x,y);
                }else{
                    return sum-x;
                }
            }else if(x>0){
                return sum-x;
            }else{
                return sum-y;
            }
        }else{
            int x = 0;
            int y = 0;
            int c = 0;
            for(int i=0;i<n;i++){
                if(nums[i]%3==2){
                    x = nums[i];
                    break;
                }
            }
            for(int i=0;i<n;i++){
                if(nums[i]%3==1){
                    y+=nums[i];
                    c++;
                    if(c==2)break;
                }
            }
            if(x>0 && y>0){
                if(c==2){
                    return sum-Math.min(x,y);
                }else{
                    return sum-x;
                }
            }else if(x>0){
                return sum-x;
            }else{
                return sum-y;
            }
        }
    }
}