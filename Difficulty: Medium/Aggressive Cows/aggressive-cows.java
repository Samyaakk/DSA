class Solution {
    public boolean minDis(int mid,int k,int arr[]){
        int c = 1;
        Arrays.sort(arr);
        int prev = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]-prev>=mid){
                c++;
                prev = arr[i];
            }
        }
        if(c>=k)return true;
        return false;
    }
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        int l = 0;
        int h = 0;
        for(int i:stalls){
            h = Math.max(h,i);
        }
        int ans = Integer.MIN_VALUE;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(minDis(mid,k,stalls)==true){
                ans = Math.max(ans,mid);
                l = mid+1;
            }else{
                h = mid-1;
            }
        }
        return ans;
    }
}