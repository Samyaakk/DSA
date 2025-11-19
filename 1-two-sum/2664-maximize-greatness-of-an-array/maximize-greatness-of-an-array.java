class Solution {
    public int maximizeGreatness(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        Arrays.sort(nums);
        int k = n-1;
        int w = 0;
        for(int i=n-2;i>=0;i--){
            if(nums[i]==nums[k]){
                continue;
            }else{
                arr[i]=nums[k--];
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        int c= 0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                // break;
            c++;
            }
        }
        return c;
    }
}