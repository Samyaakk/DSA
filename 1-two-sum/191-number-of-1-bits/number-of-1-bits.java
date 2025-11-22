class Solution {
    public int hammingWeight(int n) {
        int no = n;
        int c = 0;
        while(no>0){
            if(no%2==1)c++;
            no/=2;
        }
        return c;
    }
}