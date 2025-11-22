class Solution {
    public int setBits(int n){
        int no = n;
        int c =0;
        while(no>0){
            if(no%2==1)c++;
            no/=2;
        }
        return c;
    }
    public int[] countBits(int n) {
        int arr[] = new int[n+1];
        for(int i=1;i<=n;i++){
           arr[i] = setBits(i);
        }
        return arr;
    }
}