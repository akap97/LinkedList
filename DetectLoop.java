/* Node is defined as
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/
class Solution {
    public int detectLoop(Node head) {
        // Add code here
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return 1;
        }
        return 0;
    }
}
