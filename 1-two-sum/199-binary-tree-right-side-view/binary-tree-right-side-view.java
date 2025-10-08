/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    class Pair{
        TreeNode node;
        int val;
        Pair(TreeNode node,int val){
            this.node = node;
            this.val = val;
        }
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null)return list;
        Map<Integer,Integer> map = new HashMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                Pair p  = q.poll();
                TreeNode node = p.node;
                int  val  =p.val;
                map.put(val,node.val);
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