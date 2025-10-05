class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int vis[] = new int[adj.size()];
        q.add(0);
        vis[0]=1;
        while(!q.isEmpty()){
            int node = q.poll();
            list.add(node);
            for(int i:adj.get(node)){
                if(vis[i]==0){
                    q.add(i);
                    vis[i] = 1;
                }
            }   
        }
        return list;
    }
}