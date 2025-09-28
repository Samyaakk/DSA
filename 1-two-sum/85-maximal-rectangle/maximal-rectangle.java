class Solution {
    public int[] nsl(int arr[]){
        int res[] = new int[arr.length];
        Arrays.fill(res,arr.length);
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty()&&arr[i]<arr[st.peek()]){
                res[st.peek()]=i;
                st.pop();
            }
            st.push(i);
        }
        return res;
    }
    public int[] nsr(int arr[]){
        int res[] = new int[arr.length];
        Arrays.fill(res,-1);
        Stack<Integer> st = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty()&&arr[i]<arr[st.peek()]){
                res[st.peek()]=i;
                st.pop();
            }
            st.push(i);
        }
        return res;
    }
    public int lra(int[] heights) {
        int res[] = nsl(heights);
        int res2[] = nsr(heights);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
        for(int i=0;i<res2.length;i++){
            System.out.print(res2[i]+" ");
        }
        int area[] = new int[heights.length];
        for(int i=0;i<res.length;i++){
            area[i]=(res[i]-res2[i]-1)*heights[i];
        }
        System.out.println();
        int max=0;
        for(int i=0;i<res.length;i++){
            if(max<area[i])max=area[i];
            System.out.print(area[i]+" ");
        }
        return max;
    }
    public int maximalRectangle(char[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int mati[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]=='1'){
                    mati[i][j] = 1;
                }
            }
        }
        int arr[] = new int[m];
        int max= 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mati[i][j]==0){
                    arr[j] = 0;
                }else{
                    arr[j]+=1;
                }
            }
            max = Math.max(max,lra(arr));       
        }
        return max;
    }
}