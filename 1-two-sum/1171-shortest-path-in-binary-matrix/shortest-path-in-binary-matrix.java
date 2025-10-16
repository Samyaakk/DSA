class Pair{
    int row;
    int col;
    Pair(int row,int col){
        this.row = row;
        this.col = col;
    }
}
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid.length==1){
            if(grid[0][0]==0)return 1;
            else return -1;
        }
        int n = grid.length;
        int m = grid[0].length;
        if(grid[0][0]==1 || grid[n-1][m-1]==1)return -1;
        Queue<Pair> q = new LinkedList<>();
        int dist[][] = new int[grid.length][grid[0].length];
        dist[0][0] = 1;
        q.add(new Pair(0,0));
        int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};
        while(!q.isEmpty()){
            Pair p = q.poll();
            int row  = p.row;
            int col = p.col;
            int dis = dist[row][col];
            for(int i=0;i<8;i++){
                int nr = row+dr[i];
                int nc = col+dc[i];
                if(nr>=0 && nc>=0 && nr<n && nc<m  && dist[nr][nc]==0 && grid[nr][nc]==0){
                    dist[nr][nc] = 1 + dis; 
                    if(nr == n-1 && nc == m-1) return dis + 1; 
                    q.add(new Pair(nr, nc)); 
                }
            }
        }
        return -1;
    }
}