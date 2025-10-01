class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = 0;
        int nb = numBottles;
        int ne = numExchange;
        while(nb/ne>0){
            sum+=nb/ne;
            nb = (nb/ne) + nb%ne;
        }
        return sum + numBottles;
    }
}