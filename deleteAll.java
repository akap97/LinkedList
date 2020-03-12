/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp=head,prev=null;
         while (temp != null && temp.val == val)  
        {  
            head = temp.next; // Changed head  
            temp = head;         // Change Temp  
        }  
      
        // Delete occurrences other than head  
        while (temp != null)  
        {  
            // Search for the key to be deleted,  
            // keep track of the previous node  
            // as we need to change 'prev->next'  
            while (temp != null && temp.val != val)  
            {  
                prev = temp;  
                temp = temp.next;  
            }  
      
            // If key was not present in linked list  
            if (temp == null) return head;  
      
            // Unlink the node from linked list  
            prev.next = temp.next;  
      
            //Update Temp for next iteration of outer loop  
            temp = prev.next;  
        }  
    
        return head;
    }
}
