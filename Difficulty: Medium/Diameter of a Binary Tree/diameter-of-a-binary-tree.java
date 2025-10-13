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
} */

class Solution {
    int diameter = 0;
    public int f(Node root){
        if(root==null)return 0;
        int lh = f(root.left);
        int rh = f(root.right);
        diameter = Math.max(diameter,lh+rh);
        return 1+Math.max(lh,rh);
    }
    public int diameter(Node root) {
        // code here
        f(root);
        return diameter;
    }
}