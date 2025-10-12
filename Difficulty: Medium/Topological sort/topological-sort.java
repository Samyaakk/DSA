
class Solution {
    public static void dfs(int idx,int vis[],List<List<Integer>> list,ArrayList<Integer> res){
        vis[idx]=1;
        for(int i:list.get(idx)){
            if(vis[i]==0){
                dfs(i,vis,list,res);
            }
        }
        res.add(idx);
    }
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<V;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            list.get(edges[i][0]).add(edges[i][1]);
        }
        int vis[] = new int[V];
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                dfs(i,vis,list,res);
            }
        }
        Collections.reverse(res);
        return res;
    }
}