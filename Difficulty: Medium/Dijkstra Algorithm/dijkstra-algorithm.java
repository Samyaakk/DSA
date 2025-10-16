class Pair{
    int dist;
    int node;
    Pair(int dist,int node){
        this.dist = dist;
        this.node = node;
    }
}
class Solution {
    public int[] dijkstra(int V, int[][] edges, int src) {
        // code here
        List<List<Pair>> list = new ArrayList<>();
        int n = edges.length;
        for(int i=0;i<V;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            list.get(edges[i][0]).add(new Pair(edges[i][2],edges[i][1]));
        }
        int dis[] = new int[V];
        Arrays.fill(dis,Integer.MAX_VALUE);
        dis[src] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.dist-b.dist);
        pq.add(new Pair(0,src));
        while(!pq.isEmpty()){
            Pair p = pq.poll();
            int dist = p.dist;
            int node = p.node;
            for(Pair q:list.get(node)){
                int nNode = q.node;
                int adDis = q.dist;
                if(dist+adDis<dis[nNode]){
                    dis[nNode] = dist+adDis;
                    pq.add(new Pair(dist+adDis,nNode));
                }
            }
        }
        return dis;
    }
}