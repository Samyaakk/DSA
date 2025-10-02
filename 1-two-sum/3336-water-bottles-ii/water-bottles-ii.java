class Solution {
    public int maxBottlesDrunk(int bot, int excRate) {
    int res = bot;
    int empty = bot;
    while (empty >= excRate) {
        empty = empty - excRate + 1; 
        res++;
        excRate++;
    }
    return res;
    }
}