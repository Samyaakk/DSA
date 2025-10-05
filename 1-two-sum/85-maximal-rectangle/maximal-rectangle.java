class Solution {
    public int largestRectangle(int heights[]){
        int n = heights.length;
        int lse[] = new int[n];
        int rse[] = new int[n];
        Arrays.fill(lse,-1);
        Arrays.fill(rse,-1);
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty())lse[i] = 0;
            else lse[i] = st.peek()+1;

            st.push(i);
        }
        st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty())rse[i] = n-1;
            else rse[i] = st.peek()-1;

            st.push(i);
        }
        int max = 0;
        for(int i=0;i<n;i++){
            max= Math.max(max,(rse[i]-lse[i]+1)*heights[i]);
        }
        return max;
    }
    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        int m  = matrix[0].length;
        int mat[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                char c = matrix[i][j];
                if(c=='0')mat[i][j]= 0;
                else mat[i][j] = 1;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0)continue;
                else{
                    if(mat[i][j]==0){
                        mat[i][j] = 0;
                    }else{
                        mat[i][j] = 1 + mat[i-1][j];
                    }
                }
            }
        }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         System.out.print(mat[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        int max =0;
        for(int arr[]:mat){
            max=  Math.max(max,largestRectangle(arr));
        }
        return max;
    }
}