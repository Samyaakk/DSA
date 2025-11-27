/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode merge(ListNode h1,ListNode h2){
        ListNode h = new ListNode(-1);
        ListNode H = h;
        while(h1!=null && h2!=null){
            if(h1.val<h2.val){
                h.next = h1;
                h1 = h1.next;
            }else{ 
                h.next = h2;
                h2 = h2.next;
            }
            h = h.next;
        }
        if(h1!=null)h.next = h1;
        if(h2!=null)h.next = h2;
        return H.next;
    }
    public ListNode f(ListNode h){
        if(h==null || h.next==null){
            return h;
        }
            ListNode h1 = h;
            ListNode mid = mid(h1);
            ListNode h2 = mid.next;
            mid.next = null;
            ListNode left = f(h1);
            ListNode right = f(h2);
            return merge(left,right);
        }
    
    public ListNode mid(ListNode head){
        ListNode s = head;
        ListNode f = head.next;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
    public ListNode sortList(ListNode head) {
        return f(head);
    }
    
}