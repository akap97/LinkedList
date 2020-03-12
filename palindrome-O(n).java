/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
public boolean isPalindrome(ListNode head) {
        List<Integer> values = new ArrayList<>();
        ListNode current = head;
        while(current != null) {
            values.add(current.val);
            current = current.next;
        }
        
        int i = 0, j = values.size() - 1;
        while(i <= j) {
            if(!values.get(i++).equals(values.get(j--)))
                return false;   
        }
        
        return true;
    }
