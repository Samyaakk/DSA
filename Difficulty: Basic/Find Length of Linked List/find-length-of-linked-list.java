/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution {
    public int getCount(Node head) {
        // code here
        if(head==null)return 0;
        Node temp = head;
        int c= 0 ;
        while(temp!=null){
            c++;
            temp = temp.next;
        }
        return c;
    }
}