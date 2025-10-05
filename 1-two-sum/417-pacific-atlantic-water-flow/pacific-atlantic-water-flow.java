class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res = new ArrayList<>();
        if(heights==null||heights.length==0)return res;
        int n = heights.length;
        int m = heights[0].length;
        boolean pacific[][] = new boolean[n][m];
        boolean atlantic[][] = new boolean[n][m];
        Queue<int[]> pq = new LinkedList<>();
        Queue<int[]> aq = new LinkedList<>();
        for(int i=0;i<n;i++){
            pq.add(new int[]{i,0});
            aq.add(new int[]{i,m-1});
            pacific[i][0] = true;
            atlantic[i][m-1] = true;
        }
        for(int j=0;j<m;j++){
            pq.add(new int[]{0,j});
            aq.add(new int[]{n-1,j});
            pacific[0][j] = true;
            atlantic[n-1][j] = true;
        }
        bfs(heights,pq,pacific);
        bfs(heights,aq,atlantic);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(pacific[i][j]&&atlantic[i][j]){
                    res.add(Arrays.asList(i,j));
                }
            }
        }
        return res;
    }
    public void bfs(int heights[][],Queue<int[]> q ,boolean vis[][]){
        int n = heights.length;
        int m = heights[0].length;
        int dirs[][] = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int cell[] = q.poll();
            int r = cell[0];
            int c = cell[1];
            for(int d[]:dirs){
                int nr = r+d[0];
                int nc = c+d[1];
                if(nr<0 || nc<0 || nr>=n || nc>=m)continue;
                if(vis[nr][nc])continue;
                if(heights[nr][nc]<heights[r][c]) continue;
                vis[nr][nc] = true;
                q.add(new int[]{nr,nc});
            }
        }
    }
}