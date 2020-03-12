/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
       ArrayList<Integer> list = new ArrayList<>();
        while(head != null) {
            list.add(head.val);
            head = head.next;
        }
        
        int[] res = new int[list.size()];
        Stack<int[]> stack = new Stack<>();
        for(int i=0; i<list.size(); i++) {
            int num = list.get(i);
            while(!stack.isEmpty()) {
                int[] peek = stack.peek();
                if(peek[0] < num){
                    int[] pop = stack.pop();
                    res[pop[1]] = num;
                } else {
                    break;
                }
            }
            int[] store = new int[2];
            store[0] = num;
            store[1] = i;
            stack.push(store);
        }
        
        return res;
        
        
    }
}
