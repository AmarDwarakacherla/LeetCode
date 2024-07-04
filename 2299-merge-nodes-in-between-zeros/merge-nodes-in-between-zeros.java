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
    public ListNode mergeNodes(ListNode head) {
        ListNode ans = new ListNode(0);
        int temp = 0;
        ListNode curr = ans;
        while(head != null)
        {
            if(head.val == 0)
            {
                ListNode t = new ListNode(temp);
                curr.next = t;
                curr = curr.next;
                temp = 0;
            }
            else
            {
                temp = temp + head.val;
            }
            head = head.next;
        }
        ans = ans.next.next;
        return ans;
        
    }
}