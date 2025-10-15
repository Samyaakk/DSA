class Pair{
    int node;
    int dis;
    Pair(int node,int dis){
        this.node = node;
        this.dis = dis;
    }
}
class Solution {
    public int[] shortestPath(ArrayList<ArrayList<Integer>> adj, int src) {
        // code here
        int n = adj.size();
        int vis[] = new int[n];
        int dis[] = new int[n];
        Arrays.fill(dis,Integer.MAX_VALUE);
        dis[src] = 0;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(src,0));
        vis[src] = 0;
        while(!q.isEmpty()){
            Pair p = q.poll();
            int node = p.node;
            int dist = p.dis;
            for(int i:adj.get(node)){
                if(vis[i]==0){
                    if(1+dist<dis[i]){
                        dis[i] = 1+dist;
                    }
                    vis[i] = 1;
                    q.add(new Pair(i,dis[i]));
                }
            }
        }
        for(int i=0;i<dis.length;i++){
            if(dis[i]==Integer.MAX_VALUE)dis[i]=-1;
        }
        return dis;
    }
}
