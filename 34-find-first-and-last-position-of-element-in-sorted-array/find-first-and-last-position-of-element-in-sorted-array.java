class Solution {
    public int lastOcc(int n,int arr[],int target){
        int low = 0;
        int high = n-1;
        int ans = -1;
        while(low<=high){
            int mid = low + (high -low)/2;
            if(arr[mid]<=target){
                if(arr[mid]==target){
                    ans = Math.max(ans,mid);
                }
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
    public int firstOcc(int n,int arr[],int target){
        int low = 0;
        int high = n-1;
        int ans = Integer.MAX_VALUE;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]>=target){
                if(arr[mid]==target){
                    ans = Math.min(ans,mid);
                }
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        if(ans==Integer.MAX_VALUE)ans = -1;
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int arr[] = new int[2];
        Arrays.fill(arr,-1);
        int n = nums.length;
        arr[0] = firstOcc(n,nums,target);
        arr[1] = lastOcc(n,nums,target);
        return arr;
    }
}