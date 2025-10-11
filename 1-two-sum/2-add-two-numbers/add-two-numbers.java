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
    public ListNode rev(ListNode head){
        ListNode temp = head;
        ListNode prev =null;
        while(temp!=null){
            ListNode next = temp.next;
            temp.next = prev;
            prev =temp;
            temp = next;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null&&l2==null)return null;
        if(l1==null&&l2!=null)return l2;
        if(l1!=null&&l2==null)return l1;

        ListNode h1 = l1;
        ListNode h2 = l2;
        ListNode head = new ListNode(-1);
        ListNode temp = head;
        int car = 0;
        while(h1!=null && h2!=null){
            int sum = h1.val+h2.val+car;
            if(sum>9){
                car = 1;
            }else{
                car = 0;
            }
            head.next = new ListNode(sum%10);
            head = head.next;
            System.out.println(head.val);
            h1 = h1.next;
            h2 = h2.next;
        }
        while(h1!=null){
            int sum = car+h1.val;
            if(sum>9){
                car =1;
            }else{
                car = 0;
            }
            head.next = new ListNode(sum%10);
            head = head.next;
            h1 = h1.next;
        }
        while(h2!=null){
            int sum = car+ h2.val;
            if(sum>9){
                car = 1;
            }else{
                car = 0;
            }
            // head.next = h2;
            head.next = new ListNode(sum%10);
            head = head.next;
            h2 = h2.next;
            // h1 = h1.next;
        }
        if(car==1){
            head.next = new ListNode(1);
            head = head.next;
        }
        return temp.next;
    }
}