class Solution {
    public int maxOperations(String s) {
        int prefix = 0;
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                if(i==s.length()-1 || s.charAt(i+1)=='1'){
                    count+=prefix;
                }
            }else{
                prefix++;
            }
        }
        return count;
    }
}