class Solution {
    public int reverseBits(int n) {
        int c=0;
        int no = n;
        while(no>0){
            c++;
            no/=2;
        }
        no = n;
        int arr[] = new int[32];
        int k = 0;
        while(no>0){
            if(no%2==1){
                arr[k++]=1;
            }else{
                arr[k++]=0;
            }
            no/=2;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        k=0;
        int res = 0;
        for(int x=arr.length-1;x>=0;x--){
            if(arr[x]==1){
                res+=(int)Math.pow(2,k);
            }
            k++;
        }
        return res;
    }
}