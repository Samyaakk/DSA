class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int lse[] = new int[n];
        int rse[] = new int[n];
        Arrays.fill(lse,-1);
        Arrays.fill(rse,-1);
        Stack<Integer> st  =new Stack<>();
        for(int i=0;i<n;i++){
             while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                lse[i] = st.peek();
            }
            if (st.isEmpty()) lse[i] = 0;
            else lse[i] = st.peek()+1;
            st.push(i);
        }
        st= new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if (st.isEmpty()) rse[i] = n-1;
            else rse[i] = st.peek()-1;
            st.push(i);
        }
        int max = 0;
        for(int i=0;i<n;i++){
            max = Math.max(max,(rse[i]-lse[i]+1)*heights[i]);
        }
        // for(int i=0;i<n;i++){
        //     System.out.print(lse[i]+" ");
        // }
        // System.out.println();
        // for(int j=0;j<n;j++){
        //     System.out.print(rse[j]+" ");
        // }
        return max;
    }
}