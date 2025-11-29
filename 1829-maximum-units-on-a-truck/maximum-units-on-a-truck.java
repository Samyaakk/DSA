class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->Integer.compare(b[1],a[1]));
        int n = boxTypes.length;
        int tot = 0;
        for(int i=0;i<n;i++){
            int w = Math.min(boxTypes[i][0],truckSize);
                tot+=boxTypes[i][1]*w;
                truckSize-=w;
                if(truckSize==0)break;
        }
        return tot;
    }
}