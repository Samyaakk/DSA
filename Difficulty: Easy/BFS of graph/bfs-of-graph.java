class Solution {
        ArrayList<Integer> res = new ArrayList<>();
    public void bfs(int idx,int vis[],ArrayList<ArrayList<Integer>> adj){
        Queue<Integer> q = new LinkedList<>();
        q.add(idx);
        vis[idx] = 1;
        while(!q.isEmpty()){
            int node = q.poll();
            res.add(node);
            for(int i:adj.get(node)){
                if(vis[i]==0){
                    q.add(i);
                    vis[i]=1;
                }
            }
        }
    }
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int vis[] = new int[adj.size()];
        for(int i=0;i<adj.size();i++){
            if(vis[i]==0){
                bfs(i,vis,adj);
            }
        }
        return res;
    }
}
