class Solution {
    public int balancedStringSplit(String s) {
        int l = 0;
        int r = 0;
        int c =0;
        for(int i=0;i<s.length();i++){
            if(l==r&l!=0){
                l=0;
                r=0;
                c++;
            }
            if(s.charAt(i)=='L')l++;
            else r++;
        }
        if(l==r&&l!=0)c=c+1;
        return c;
    }
}