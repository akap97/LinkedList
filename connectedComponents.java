/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] G) {
       HashSet<Integer> hs = new HashSet<>();
        for(int num: G){
            hs.add(num);
        }
        
        boolean found = false;
        int res = 0;
        ListNode curr = head;
        while(curr != null) {
            if(hs.contains(curr.val)){
                if(!found){
                    found = true;
                    res++;
                }
            } else {
                found = false;
            }
            curr = curr.next;
        }
        return res; 
    }
}
