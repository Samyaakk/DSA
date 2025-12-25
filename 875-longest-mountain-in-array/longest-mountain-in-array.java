class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        if(n<3)return 0;
        int ltr[] = new int[n];
        int rtl[] = new int[n];
        ltr[0] = 1;
        int x= 0;
        int y= 0;
        for(int i=1;i<n;i++){
            if(arr[i-1]<arr[i]){
                x++;
                ltr[i] = ltr[i-1]+1;
            }else{
                ltr[i] = 1;
            }
        }
        rtl[n-1] = 1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]>arr[i+1]){
                y++;
                rtl[i] = rtl[i+1]+1;
            }else{
                rtl[i] = 1;
            }
        }
        int max = 0;
        for(int i=0;i<n;i++){
            System.out.print(ltr[i]+" ");
        }
        System.out.println();
        for(int j=0;j<n;j++){
            System.out.print(rtl[j]+" ");
        }
        for(int i=1;i<n-1;i++){
            if(ltr[i]>1&&rtl[i]>1){
                max = Math.max(max,rtl[i]+ltr[i]);
            }
        }
        if(max==2||max==1||max==0)return 0;
        if(x==0||y==0)return 0;
        return max-1;
    }
}