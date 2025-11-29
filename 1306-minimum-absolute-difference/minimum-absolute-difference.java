class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            min = Math.min(min,arr[i]-arr[i-1]);
        }
        List<List<Integer>> res = new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            List<Integer> l = new ArrayList<>();
            if(arr[i]-arr[i-1]==min){
                l.add(arr[i-1]);
                l.add(arr[i]);
            }
            if(l.size()>=1)res.add(l);
        }   
        return res;
    }
}