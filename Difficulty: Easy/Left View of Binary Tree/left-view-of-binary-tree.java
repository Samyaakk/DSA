/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    class Pair{
        Node node;
        int val;
        Pair(Node node,int val){
            this.node = node;
            this.val = val;
        }
    }
    public ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();
        Map<Integer,Integer> map = new TreeMap<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                Pair p = q.poll();
                Node node = p.node;
                int val =  p.val;
                if(!map.containsKey(val)){
                    map.put(val,node.data);
                }
                if(node.left!=null){
                    q.add(new Pair(node.left,val+1));
                }
                if(node.right!=null){
                    q.add(new Pair(node.right,val+1));
                }
            }
        }
        for(Map.Entry<Integer,Integer> mp:map.entrySet()){
            list.add(mp.getValue());
        }
        return list;
    }
}