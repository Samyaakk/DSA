class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->Integer.compare(b[1],a[1]));
        int n = boxTypes.length;
        int m = boxTypes[0].length;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         System.out.print(boxTypes[i][j]);
        //     }
        //     System.out.println();
        // }
        int x = 0;
        int y =0;
        int tot = 0;
        for(int i=0;i<n;i++){
            int w = boxTypes[i][0];
            while(w>0){
                if(x>=truckSize)break;
                tot+=boxTypes[i][1];
                x++;
                w--;
            }
        }
        return tot;
    }
}