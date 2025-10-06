class Solution {
    public boolean dfs(int idx,int vis[],int path[],List<List<Integer>> list){
        vis[idx] = 1;
        path[idx] = 1;
        for(int i:list.get(idx)){
            if(vis[i]==0){
                if(dfs(i,vis,path,list))return true;
            }else if(path[i]==vis[idx]){
                return true;
            }
        }
        path[idx] = 0;
        return false;
    }
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<V;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            list.get(edges[i][0]).add(edges[i][1]);
        }
        for(int i=0;i<V;i++){
        int vis[] = new int[V];
        int path[] = new int[V];
            if(vis[i]==0){
                if(dfs(i,vis,path,list))return true;
            }
        }
        return false;
    }
}