class Solution {
    public boolean dfs(int idx,int p,int vis[],List<List<Integer>> adj){
        vis[idx]  = 1;
        for(int i:adj.get(idx)){
            if(vis[i]==0){
                if(dfs(i,idx,vis,adj))return true;
            }else if(i!=p){
                return true;
            }
        }
        return false;
    }
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<V;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            list.get(edges[i][0]).add(edges[i][1]);
            list.get(edges[i][1]).add(edges[i][0]);
        }
        int vis[] = new int[V];
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                if(dfs(i,-1,vis,list))return true;
            }
        }
        return false;
    }
}