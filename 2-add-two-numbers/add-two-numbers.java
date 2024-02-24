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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode tail = head;
        int d1,d2,c,sum;
        c=0;sum=0;
        while(l1!=null || l2!=null || c!=0)
        {
            d1=0;d2=0;
            if(l1!=null)
            {
                d1=l1.val;
                l1=l1.next;
            }
            if(l2!=null)
            {
                d2=l2.val;
                l2=l2.next;
            }
            if(tail.val!=-1)
            {
                tail.next = new ListNode();
                tail = tail.next;
            }
            sum=d1+d2+c;
            tail.val = sum%10;
            c = sum/10;
        }
        return head;
    }
}