class Solution {
    public void swap(int a,int b,int arr[]){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public void sortColors(int[] nums) {
        int l = 0;
        int h = nums.length-1;
        int mid = 0;
        while(mid<=h){
            if(nums[mid]==0){
                swap(mid,l,nums);
                l++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                swap(mid,h,nums);
                h--;
            }
        }
    }
}