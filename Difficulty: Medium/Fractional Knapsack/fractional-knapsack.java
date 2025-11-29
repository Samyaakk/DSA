class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        int n = val.length;
        double arr[][] = new double[n][3];
        for(int i=0;i<n;i++){
            arr[i][0] = val[i];
            arr[i][1] = wt[i];
            arr[i][2] = val[i]/(double)wt[i];
        }
        Arrays.sort(arr,(a,b)->Double.compare(b[2],a[2]));
        double tot = 0;
        for(int i=0;i<n;i++){
            if(capacity-arr[i][1]>=0){
                tot+=arr[i][0];
                capacity-=arr[i][1];
            }else{
                tot+=(capacity/arr[i][1])*arr[i][0];
                capacity = 0;
            }
            if(capacity==0)break;
        }
        return tot;
    }
}