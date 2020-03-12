/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         // Take Dummy Node
        ListNode dummy = new ListNode(0);
        
        // for traverse/added node in the list.
        ListNode runner = dummy;
        
        l1 = reversed(l1);
        l2 = reversed(l2);
        int carry = 0;
        
        while(l1 != null && l2 != null){
            int sum = l1.val + l2.val + carry;
            int lastDigit = sum % 10;
            runner.next = new ListNode(lastDigit);
            runner = runner.next;
                
            carry = sum / 10;
            
            l1 = l1.next;
            l2 = l2.next;
        }
        
        // if l2==null, l1 != null
        while(l1 != null){
                int sum = l1.val + carry;
                carry = sum / 10;
                int lastDigit = sum % 10;
                runner.next = new ListNode(lastDigit);
                runner = runner.next;
                l1= l1.next;
        }
        
        // if l1==null, l2 != null
        while(l2 != null){
                int sum = l2.val + carry;
                carry = sum / 10;
                int lastDigit = sum % 10;
                runner.next = new ListNode(lastDigit);
                runner = runner.next;
                l2 = l2.next;
        }
        
        if(carry != 0){
            runner.next = new ListNode(carry);
            runner = runner.next;
        }
        ListNode finalResult = dummy.next;
        finalResult = reversed(finalResult);
        return finalResult;
    }
    
    // reverse the list
    public ListNode reversed(ListNode current){
        ListNode prev = null;
        ListNode next = null;
        
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    }
