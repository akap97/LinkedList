//User function Template for Java

/*
delete n nodes after m nodes
The input list will have at least one element  
Node is defined as
  class Node
  {
      int data;
      Node next;
      Node(int data)
      {
          this.data = data;
          this.next = null;
      }
  }
*/

class Solution
{
    static void linkdelete(Node head, int M, int N)
    {
        // your code here
       if (M == 0 && N > 0) head = null;                                // take care of edge cases
        if (head == null || N == 0)   return;
        
        Node curr = head;
        while (curr != null) {
            int count = 0;
            while (curr != null && ++count < M) curr = curr.next;       // skip M-1 nodes
            if (curr == null)   return;                                 // if curr is at the end, return
            
            Node prev = curr;                                           // save the node and delete after
            count = 0;
            while (curr != null && count++ <= N) curr = curr.next;      // skip N+1 nodes
            
            prev.next = curr;                                           // delete between prev and curr
        }
  
  }
}
