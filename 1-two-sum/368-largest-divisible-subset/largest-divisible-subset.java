class Solution {
    public List<Integer> largestDivisibleSubset(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);
        int dp[] = new int[n];
        int hash[] = new int[n];
        for(int i=0;i<n;i++){
            hash[i] = i;
        }
        Arrays.fill(dp,1);
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[i]%arr[j]==0 || arr[j]%arr[i]==0){
                    if(dp[i]<=1+dp[j]){
                        dp[i] = 1+dp[j];
                        hash[i] = j;
                    }
                }
            }
        }
        int lidx = -1;
        int ans  = -1;
        for(int i=0;i<n;i++){
            if(dp[i]>ans){
                ans = dp[i];
                lidx = i;
            }
        }
        list.add(arr[lidx]);
        while(hash[lidx]!=lidx){
            lidx = hash[lidx];
            list.add(arr[lidx]);
        }
        Collections.sort(list);
        // for(int i=0;i<n;i++){
        //     System.out.print(dp[i]+" ");
        // }
        // System.out.println();
        // for(int i=0;i<n;i++){
        //     System.out.print(hash[i]+" ");
        // }
        return list;
    }
}