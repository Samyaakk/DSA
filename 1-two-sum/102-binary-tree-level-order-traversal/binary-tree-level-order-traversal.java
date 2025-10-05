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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root==null)return list;
        Queue<TreeNode> st = new LinkedList<>();
        st.add(root);
        while(!st.isEmpty()){
            int size = st.size();
            List<Integer> ll = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node = st.poll();
                ll.add(node.val);
                if(node.left!=null)st.add(node.left);
                if(node.right!=null)st.add(node.right);
            }
            list.add(ll);
        }
        return list;
    }
}