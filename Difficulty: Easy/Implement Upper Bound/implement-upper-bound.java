class Solution {
    int upperBound(int[] arr, int target) {
        // code here
        int l = 0;
        int h = arr.length-1;
        int ans = Integer.MAX_VALUE;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(arr[mid]>target){
                ans = Math.min(mid,ans);
                h = mid-1;
            }else{
                l = mid+1;
            }
        }
        if(ans == Integer.MAX_VALUE)return arr.length;
        return ans;
    }
}
