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
class Pair{
    TreeNode node;
    int row;
    int col;
    Pair(TreeNode node,int row,int col){
        this.node = node;
        this.row = row;
        this.col = col;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();
        Map<Integer,Map<Integer,List<Integer>>> map = new TreeMap<>();
        q.add(new Pair(root,0,0));
        while(!q.isEmpty()){
            Pair p = q.poll();
            TreeNode node = p.node;
            int x = p.row;
            int y = p.col;
            map.computeIfAbsent(x,k->new TreeMap<>())
               .computeIfAbsent(y,k->new ArrayList<>())
               .add(node.val);
            if(node.left!=null){
                q.add(new Pair(node.left,x-1,y+1));
            }
            if(node.right!=null){
                q.add(new Pair(node.right,x+1,y+1));
            }
        }
        for(Map<Integer,List<Integer>> colMap:map.values()){
            List<Integer> colList = new ArrayList<>();
            for(List<Integer> rowList:colMap.values()){
                Collections.sort(rowList);
                colList.addAll(rowList);
            }
            res.add(colList);
        }
        return res;
    }
}