// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        // Map<Integer,Integer> map = new HashMap<>();
        // int max  =0;
        // int sum = 0;
        // for(int i=0;i<arr.length;i++){
        //     sum+=arr[i];
        //     if(sum==k)max = i+1;
        //     if(map.containsKey(k-sum)){
        //         max = Math.max(max,i-map.get(k-sum));
        //     }
        //     map.putIfAbsent(sum,i);
        // }
        // return max;
        Map<Integer, Integer> map = new HashMap<>();
    int sum = 0, maxLen = 0;

    for (int i = 0; i < arr.length; i++) {
        sum += arr[i];

        if (sum == k) {
            maxLen = i + 1;
        }

        if (map.containsKey(sum - k)) {
            maxLen = Math.max(maxLen, i - map.get(sum - k));
        }

        map.putIfAbsent(sum, i);
    }
    return maxLen;
    }
}
