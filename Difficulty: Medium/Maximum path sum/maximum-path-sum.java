/*
class Node{
    int data;
    Node left, right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    int max  =Integer.MIN_VALUE;
    int fms(Node root){
        if(root==null)return 0;
        int lsum = Math.max(0,fms(root.left));
        int rsum = Math.max(0,fms(root.right));
        max = Math.max(max,root.data+lsum+rsum);
        return root.data+Math.max(lsum,rsum);
    }
    int findMaxSum(Node root) {
        // code here
        if(root==null)return 0;
        if(root.left==null&&root.right==null)return root.data;
        fms(root);
        return max;
    }
}