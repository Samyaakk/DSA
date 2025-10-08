/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    class Pair{
        Node root;
        int val;
        Pair(Node root,int val){
            this.root  = root;
            this.val = val;
        }
    }
    public ArrayList<Integer> bottomView(Node root) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Pair> q  = new LinkedList<>();
        Map<Integer,Integer> map = new TreeMap<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair p = q.poll();
            Node node = p.root;
            int val = p.val;
            map.put(val,node.data);
            if(node.left!=null){
                q.add(new Pair(node.left,val-1));
            }
            if(node.right!=null){
                q.add(new Pair(node.right,val+1));
            }
        }
        // Collections.sort(map);
        for(Map.Entry<Integer,Integer> mp:map.entrySet()){
            list.add(mp.getValue());
        }
        return list;
    }
}