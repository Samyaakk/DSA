class Solution {
    public int smallestNumber(int n) {
        for(int i=n;i<=100000000;i++){
            int no = i;
            while(no>=1){
                if(no%2==0){
                    break;
                }else{
                    if(no==1)return i;
                    no=no/2;
                }
            }
        }
        return -1;
    }
}