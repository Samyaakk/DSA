class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int l = 0;
        int r = arr.length-1;
        while(l<r){
            int mid = (l+r)/2;
            if(arr[mid]==target){
                r=mid;
            }else if(arr[mid]<target){
                l=mid+1;
            }else{
                r=mid;
            }
        }
        if(arr[r]<target)return r+1;
        return r;
    }
}
