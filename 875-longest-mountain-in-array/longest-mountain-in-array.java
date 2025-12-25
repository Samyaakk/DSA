class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        boolean uph  = false;
        boolean dh = false;
        int i=0;
        int max =0;
        while(i<n){
            int start = i;
            if(i!=n-1 && arr[i]<arr[i+1]){
                while(i<n-1 && arr[i]<arr[i+1]){
                    uph=true;
                    i++;
                }
                while(i<n-1 && arr[i]>arr[i+1]){
                    dh=true;
                    i++;
                }
                if(uph && dh){
                    max = Math.max(max,i-start+1);
                }
                uph=false;
                dh=false;
            }else{
                i++;
            }
        }
        return max;
    }
}