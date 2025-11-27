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
    public ListNode getMid(ListNode h1){
        ListNode s = h1;
        ListNode f = h1.next;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
    public ListNode mergeSort(ListNode head){
        if(head==null||head.next==null)return head;
        ListNode h1 = head;
        ListNode mid = getMid(h1);
        ListNode h2 =  mid.next;
        mid.next = null;
        ListNode left = mergeSort(h1);
        ListNode right = mergeSort(h2);
        return merge(left,right);
    }
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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode(-1);
        ListNode H = head;
        for(ListNode h:lists){
            while(h!=null){
                head.next = h;
                h=h.next;
                head = head.next;
            }
        }

        return mergeSort(H.next);
    }
}