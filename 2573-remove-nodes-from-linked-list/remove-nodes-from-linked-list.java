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
    public ListNode removeNodes(ListNode head) {
        head = reverse(head);
        ListNode temp = head;
        int max = temp.val;
        while(temp.next!=null)
        {
            if(max>temp.next.val)
            {
                ListNode t = temp.next;
                temp.next = t.next;
            }
            else
            {
                max = temp.next.val;
                temp=temp.next;
            }
        }
        head = reverse(head);
        return head;

        
    }
    ListNode reverse(ListNode head)
    {
        ListNode current = null;
        while(head!=null)
        {
            ListNode next = head.next;
            head.next = current;
            current = head;
            head = next;
        }
        return current;
    }
}