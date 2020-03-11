/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null, curr=head;
        while(curr!=null)
        {
            ListNode tmp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=tmp;
        }

        return prev;
        
    }
}
