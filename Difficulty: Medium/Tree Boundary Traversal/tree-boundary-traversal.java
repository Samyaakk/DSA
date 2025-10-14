/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    public boolean isLeafNode(Node root){
        if(root.left==null && root.right==null)return true;
        return false;
    }
    public void addLeftNode(Node root,ArrayList<Integer> list){
        Node curr = root.left;
        while(curr!=null){
            if(!isLeafNode(curr)){
                list.add(curr.data);
            }
            if(curr.left!=null){
                curr = curr.left;
            }else{
                curr = curr.right;
            }
        }
    }
    public void addLeafNode(Node root,ArrayList<Integer> list){
        if(isLeafNode(root)){
            list.add(root.data);
        }
        if(root.left!=null)addLeafNode(root.left,list);
        if(root.right!=null)addLeafNode(root.right,list);
    }
    public void addRightNode(Node root,ArrayList<Integer> list){
        ArrayList<Integer> temp = new ArrayList<>();
        Node curr = root.right;
        while(curr!=null){
            if(!isLeafNode(curr)){
                temp.add(curr.data);
            }
            if(curr.right!=null){
                curr = curr.right;
            }else{
                curr = curr.left;
            }
        }
        Collections.reverse(temp);
        for(int i=0;i<temp.size();i++){
            list.add(temp.get(i));
        }
    }
    
    ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        ArrayList<Integer> list  =new ArrayList<>();
        if(root==null)return list;
        if(isLeafNode(root)==false)list.add(root.data);
        addLeftNode(root,list);
        addLeafNode(root,list);
        addRightNode(root,list);
        return list;
        
    }
}