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
    int max = 0;
    public int height(TreeNode root){
        if(root==null)return 0;
        int lh = 1+height(root.left);
        int rh = 1+height(root.right);
        max = Math.max(max,Math.abs(lh-rh));
        return Math.max(lh,rh);
    }
    public boolean isBalanced(TreeNode root) {
        height(root);
        if(max>1)return false;
        return true;
    }
}