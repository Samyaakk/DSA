// User function Template for Java
class Pair{
    int dist;
    int row;
    int col;
    Pair(int dist,int row,int col){
        this.dist = dist;
        this.row = row;
        this.col  =col;
    }
}
class Solution {

    int shortestPath(int[][] grid, int[] source, int[] destination) {
        if(source[0]==destination[0] && destination[1]==source[1])return 0;
        // Your code here
        int n = grid.length;
        int m = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0,source[0],source[1]));
        int dist[][] = new int[n][m];
        for(int arr[]:dist){
            Arrays.fill(arr,Integer.MAX_VALUE);
        }
        dist[source[0]][source[1]] = 1;
        int dr[] = {-1,0,1,0};
        int dc[] = {0,1,0,-1};
        while(!q.isEmpty()){
            Pair p = q.poll();
            int dis = p.dist;
            int row = p.row;
            int col = p.col;
            for(int i=0;i<4;i++){
                int nr = row+dr[i];
                int nc = col+dc[i];
                if(nr>=0 && nc>=0 && nr<n && nc<m && grid[nr][nc]==1 && 1+dis<dist[nr][nc]){
                    dist[nr][nc] = 1+dis;
                    if(nr==destination[0] && nc==destination[1])return 1+dis;
                    q.add(new Pair(1+dis,nr,nc));
                }
            }
        }
        return -1;
    }
}
