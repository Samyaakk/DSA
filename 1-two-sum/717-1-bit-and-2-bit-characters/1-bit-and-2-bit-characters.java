class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        boolean ob = false;
        boolean tb = false;
        for(int i=0;i<bits.length;i++){
            if(bits[i]==0){
                ob = true;
                tb = false;
                continue;
            }else{
                i+=1;
                tb = true;
                ob = false;
            }
        }
        return ob;
        // if(n==1 && bits[0]==0)return true;
        // if(n%2==0){
        //     if((bits[n-1]==0&&bits[n-2]==0))return true;
        // }
        // if(n>=3 && n%2==1){
        //     if(bits[n-1]==0 && ((bits[n-2]==1 && bits[n-3]==1)||(bits[n-2]==0&&bits[n-3]==1)||(bits[n-2]==0 && bits[n-3]==0))){
        //         return true;
        //     }
        // }
        // return false;
    }
}