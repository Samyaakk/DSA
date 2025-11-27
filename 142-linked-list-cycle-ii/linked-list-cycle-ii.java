/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null)return null;
        ListNode f = head;
        ListNode s = head;
        int c =0;
        while(f!=null&& f.next!=null){
            s = s.next;
            f = f.next.next;
            if(s==f){
                c++;
                break;
            }
        }
       if(c==0)return null; 
        // if(f.next==null)return null;
        f = head;
        while(s!=f){
            s=s.next;
            f=f.next;
        }
        return s;
    }
}