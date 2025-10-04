class Solution {
    int nodes = 0;
    int edgest = 0;
    public void dfs(int idx,int vis[],List<List<Integer>> adj){
        vis[idx] = 1;
        nodes++;
        for(int i:adj.get(idx)){
            edgest++;
            if(vis[i]==0){
                dfs(i,vis,adj);
            }
        }
    }
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            list.get(edges[i][0]).add(edges[i][1]);
            list.get(edges[i][1]).add(edges[i][0]);
        }
        int vis[] = new int[n];
        int x = 0;
        for(int i=0;i<n;i++){
            nodes=0;
            edgest=0;
            if(vis[i]==0){
                dfs(i,vis,list);
                if((edgest/2)==((nodes*(nodes-1))/2))x++;
            }
        }
        return x;
    }
}