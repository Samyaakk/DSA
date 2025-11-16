class Solution {
    public int numSub(String s) {
        double tot = 0;
        double c  =0 ;
        double MOD = 1e9+7;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')c++;
            else{
                // System.out.println(c);
                tot+=((c%(MOD)*(c+1)%(MOD))/2);
                c=0;
            }
        }
        if(c!=0){
           tot+=((c%(MOD)*(c+1)%(MOD))/2);
        }
        return (int)(tot);
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)=='1'){
        //         for(int j=i;j<s.length();j++){
        //             if(s.charAt(i)==s.charAt(j)){
        //                 tot++;
        //             }else{
        //                 break;
        //             }
        //         }
        //     }
        // }
        // return tot;
    }
}