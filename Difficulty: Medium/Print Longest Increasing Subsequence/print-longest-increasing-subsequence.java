// User function Template for Java

class Solution {
    public ArrayList<Integer> getLIS(int arr[]) {
        // Code here
        ArrayList<Integer> list = new ArrayList<>();
        int max = 0;
        int n = arr.length;
        int dp[] = new int[n];
        int hash[] = new int[n];
        for(int i=0;i<n;i++){
            hash[i] = i;
        }
        int lastIdx = 0;
        Arrays.fill(dp,1);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]){
                    if(dp[j]+1>dp[i]){
                        dp[i] = dp[j]+1;
                        hash[i] = j;
                    }
                }
            }
            if(dp[i]>max){
                max = dp[i];
                lastIdx = i;
            }
        }
        // for(int i=0;i<n;i++){
        //     System.out.print(hash[i]+" ");
        // }
        list.add(arr[lastIdx]);
        while(hash[lastIdx]!=lastIdx){
            lastIdx = hash[lastIdx];
            list.add(arr[lastIdx]);
        }
        Collections.sort(list);
        return list;
    }
}
