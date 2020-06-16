/* Structure of node

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class GfG
{
    // Function to find the nth node from end in the linked list
    // head: head of the linked list
    // n: nth node from end to find
    int getNthFromLast(Node head, int n)
    {
    	// Your code here
    	int len=0;
    	Node ptr=head;
    	while(head!=null)
    	{
    	    len++;
    	    head=head.next;
    	}
    	if((len-n)<0)
    	    return -1;
    	   else {
    	       int count=len-n;
    	       while(count>0)
    	       {
    	           ptr=ptr.next;
    	           count--;
    	       }
    	   }
    return ptr.data;
    }
}
