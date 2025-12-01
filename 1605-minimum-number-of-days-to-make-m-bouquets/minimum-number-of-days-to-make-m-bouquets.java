class Solution {
    public int count(int days,int m,int k,int arr[]){
        int tot = 0;
        int c= 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=days){
                tot++;
            }else{
                tot = 0;
            }
            if(tot%k==0 && tot!=0)c++;
        }
        return c;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if(m*k>n)return -1;
        int low = 1;
        int high = (int)1e9;
        int ans = Integer.MAX_VALUE;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(count(mid, m, k,bloomDay)>=m){
                ans = Math.min(ans,mid);
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        if(ans==Integer.MAX_VALUE)return -1;
        return ans;
    }
}