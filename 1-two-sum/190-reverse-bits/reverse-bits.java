class Solution {
    public int reverseBits(int n) {
        int no = n;
        int res = 0;
        for(int i=0;i<32;i++){
            res<<=1;
            res|=(no&1);
            no>>=1;
        }
        // no = n;
        // int arr[] = new int[32];
        // int k = 0;
        // while(no>0){
        //     if(no%2==1){
        //         arr[k++]=1;
        //     }else{
        //         arr[k++]=0;
        //     }
        //     no/=2;
        // }
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // k=0;
        // int res = 0;
        // for(int x=arr.length-1;x>=0;x--){
        //     if(arr[x]==1){
        //         res+=(int)Math.pow(2,k);
        //     }
        //     k++;
        // }
        return res;
    }
}