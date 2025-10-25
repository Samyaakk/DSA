class Solution {
    public int totalMoney(int n) {
        int sum = 0;
        int x= 1;
        int y = 7;
        while(n>0){
            for(int i=x;i<=y;i++){
                if(n==0)break;
                sum+=i;
                n--;
            }
            x++;
            y++;
        }
        return sum;
    }
}