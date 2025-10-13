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
    int maxSum = Integer.MIN_VALUE;
    int mps(Node root){
        if(root==null)return 0;
        int ls = Math.max(0,mps(root.left));
        int rs = Math.max(0,mps(root.right));
        maxSum = Math.max(maxSum,ls+rs+root.data);
        return root.data+Math.max(rs,ls);
    }
    int findMaxSum(Node root) {
        // code here
        mps(root);
        return maxSum;
    }
}