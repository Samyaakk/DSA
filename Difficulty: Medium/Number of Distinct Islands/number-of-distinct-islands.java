// User function Template for Java

class Pair{
    int first;
    int second;
    Pair(int first,int second){
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public void dfs(int row,int col,int vis[][],int grid[][],List<String> list,int row0,int col0){
        vis[row][col] = 1;
        list.add((row-row0)+","+(col-col0));
        int n = grid.length;
        int m = grid[0].length;
        int drow[] = {-1,0,1,0};
        int dcol[] = {0,-1,0,1};
        for(int i=0;i<4;i++){
            int nr = row+drow[i];
            int nc = col+dcol[i];
            if(nr>=0 && nr<n && nc>=0 && nc<m && vis[nr][nc]==0 && grid[nr][nc]==1){
                dfs(nr,nc,vis,grid,list,row0,col0);
            }
        }
    }
    int countDistinctIslands(int[][] grid) {
        // Your Code here
        int n = grid.length;
        int m = grid[0].length;
        int vis[][] = new int[n][m];
        HashSet<List<String>> st = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0 && grid[i][j] ==1){
                    List<String> list = new ArrayList<>();
                    dfs(i,j,vis,grid,list,i,j);
                    st.add(list);
                }
            }
        }
        return st.size();
    }
}
