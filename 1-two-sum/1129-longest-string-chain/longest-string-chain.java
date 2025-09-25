class Solution {
    public boolean check(String a,String b){
        if(a.length()!=b.length()+1)return false;
        int f = 0;
        int s = 0;
        while(f<a.length() && s<b.length()){
            if(a.charAt(f)==b.charAt(s)){
                f++;
                s++;
            }else{
                f++;
            }
        }
        return s==b.length();
    }
    public int longestStrChain(String[] words) {
        if(words.length==1)return 1;
        int n  =words.length;
        Arrays.sort(words,(a,b)-> a.length()-b.length());
        for(int i=0;i<words.length;i++){
            System.out.println(words[i]);
        }
        int dp[] = new int[n];
        Arrays.fill(dp,1);
        int max=  0;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(check(words[i],words[j])&&dp[i]<dp[j]+1){
                    dp[i] = dp[j]+1;
                }
            }
            if(max<dp[i]){
                max = dp[i];
            }
        }
        return max;
    }
}