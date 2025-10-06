/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    ArrayList<Integer> postOrder(Node root) {
        // code here
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        st1.push(root);
        while(!st1.isEmpty()){
            Node node = st1.pop();
            if(node.left!=null)st1.push(node.left);
            if(node.right!=null)st1.push(node.right);
            st2.push(node);
        }
        ArrayList<Integer> list  = new ArrayList<>();
        while(!st2.isEmpty()){
            list.add(st2.pop().data);
        }
        return list;
    }
}