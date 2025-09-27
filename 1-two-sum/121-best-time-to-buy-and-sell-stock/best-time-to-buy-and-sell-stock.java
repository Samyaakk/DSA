class Solution {
    public int maxProfit(int[] prices) {
        int bp = Integer.MAX_VALUE;
        int max = 0;
        for(int i=0;i<prices.length;i++){
            if(bp>prices[i]){
                bp = prices[i];
            }else{
                int sp = prices[i];
                int profit = sp - bp;
                max = Math.max(max,profit);
            }
        }
        return max;
    }
}