class Solution {
    public boolean  check(long time,int n,int batt[]){
        long contri = 0;
        for(long i:batt){
            contri+=Math.min(time,i);
            if(contri>=n*time)return true;
        }
        return false;
    }
    public long maxRunTime(int n, int[] batteries) {
        long low = 0;
        long high = (long)1e14;
        long mid = 0;
        long ans = 0;
        while(low<=high){
            mid = low + (high-low)/2;
            if(check(mid,n,batteries)==true){
                ans = Math.max(ans,mid);
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
}