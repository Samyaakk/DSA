class Solution {
    public int hammingWeight(int n) {
        int c=0;
        while(n>0){
            if((n&1)==1)c++;
            n>>=1;
        }
        return c;
        // int no = n;
        // int c = 0;
        // while(no>0){
        //     if(no%2==1)c++;
        //     no/=2;
        // }
        // return c;
    }
}