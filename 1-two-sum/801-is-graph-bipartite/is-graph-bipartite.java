class Solution {
    public boolean dfs(int idx,int vis[],List<List<Integer>> adj){
        for(int i:adj.get(idx)){
            if(vis[i]==-1){
                vis[i]=1-vis[idx];
                if(!dfs(i,vis,adj))return false;
            }else if(vis[i]==vis[idx]){
                return false;
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<graph[i].length;j++){
                list.get(i).add(graph[i][j]);
            }
        }
        for(int i=0;i<n;i++){
        int vis[] = new int[n];
        Arrays.fill(vis,-1);
            if(vis[i]==-1){
               if(!dfs(i,vis,list))return false;
            }
        }
        return true;
    }
}