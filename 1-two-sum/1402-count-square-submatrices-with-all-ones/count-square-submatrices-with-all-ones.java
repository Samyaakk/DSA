class Solution {
    public int countSquares(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(mat[i][j]==0){
                    continue;
                }else{
                    mat[i][j] = 1+Math.min(mat[i-1][j],Math.min(mat[i][j-1],mat[i-1][j-1]));
                }
            }
        }
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                count+=mat[i][j];
            }
        }
        return count;
    }
}