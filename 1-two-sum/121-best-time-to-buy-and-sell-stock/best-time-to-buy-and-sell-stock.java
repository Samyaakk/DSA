class Solution {
    public int maxProfit(int[] prices) {
        int maxp = 0;
        int bp = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(bp>prices[i]){
                bp = prices[i];
            }else {
                int sp  =prices[i];
                int profit  = sp-bp;
                maxp = Math.max(maxp,profit);
            }
        }
        return maxp;
    }
}