class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n-1;
        int mw = 0;
        while(l<r){
            int ws = Math.min(height[l],height[r])*(r-l);
            mw = Math.max(mw,ws);
            if(height[l]>height[r]){
                r--;
            }else{
                l++;
            }
        }
        return mw;
    }
}