/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> h=new HashSet<>();
        while(headA!=null || headB!=null)
        {
            if(!h.contains(headA) && headA!=null)
            {
                h.add(headA);
                headA=headA.next;
            }
            if(!h.contains(headB) && headB!=null)
            {
                h.add(headB);
                headB=headB.next;
            }
            if(h.contains(headA))
                return headA;
            if(h.contains(headB))
                return headB;
        }
        return null;
        
    }
}
