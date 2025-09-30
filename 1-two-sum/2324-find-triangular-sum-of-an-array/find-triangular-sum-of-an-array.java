class Solution {
    public int triangularSum(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        while(list.size()>1){
            List<Integer> upList = new ArrayList<>();
            for(int i=1;i<list.size();i++){
                upList.add((list.get(i)+list.get(i-1))%10);
            }
            list = upList;
        }
        return list.get(0);
    }
}