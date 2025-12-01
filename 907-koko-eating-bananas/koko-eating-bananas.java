class Solution {
    public long hours(int k,int h,int arr[]){
        long c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%k==0){
                c+=arr[i]/k;
            }else{
                c+=(arr[i]/k)+1;
            }
        }
        System.out.println(c);
        return c;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        if(h<n)return -1;
        int hi = 0;
        int l = 1;
        for(int i:piles){
            hi = Math.max(hi,i);
        }
        int ans = Integer.MAX_VALUE;
        while(l<=hi){
            int mid = l + (hi-l)/2;
            if(hours(mid,h,piles)<=h){
                ans = Math.min(ans,mid);
                hi=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }
}