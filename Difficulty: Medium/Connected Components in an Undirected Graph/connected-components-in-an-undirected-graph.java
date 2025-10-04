
class Solution {
    ArrayList<Integer> sres = new ArrayList<>();
    public void dfs(int idx,int vis[],List<List<Integer>> adj){
        vis[idx] = 1;
        sres.add(idx);
        for(int i:adj.get(idx)){
            if(vis[i]==0){
                dfs(i,vis,adj);
            }
        }
    }
    public ArrayList<ArrayList<Integer>> getComponents(int V, int[][] edges) {
        // code here
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<V;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            list.get(edges[i][0]).add(edges[i][1]);
            list.get(edges[i][1]).add(edges[i][0]);
        }
        int vis[] = new int[V];
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int i=0;i<V;i++){
            sres = new ArrayList<>();
            if(vis[i]==0){
                dfs(i,vis,list);
                res.add(sres);
            }
        }
        return res;
    }
}