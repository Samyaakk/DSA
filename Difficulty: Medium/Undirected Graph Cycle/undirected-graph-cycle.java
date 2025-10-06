class Solution {
    class Pair{
        int node;
        int parent;
        Pair(int node,int parent){
            this.node = node;
            this.parent = parent;
        }
    }
    public boolean bfs(int idx,int vis[],List<List<Integer>> list){
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(idx,-1));
        vis[idx] = 1;
        while(!q.isEmpty()){
            Pair p = q.poll();
            int node = p.node;
            int parent = p.parent;
            for(int i:list.get(node)){
                if(vis[i]==0){
                    vis[i] = 1;
                    q.add(new Pair(i,node));
                }else if(i!=parent){
                    return true;
                }
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
                if(bfs(i,vis,list))return true;
            }
        }
        return false;
    }
}