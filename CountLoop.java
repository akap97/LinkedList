/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}*/

//Function should return the length of the loop in LL.
class Loop
{
    int countNodesinLoop(Node head)
    {
	    //Add your code here.
	    Node slow=head,fast=head;
	    while(fast!=null && fast.next!=null)
	    {
	        slow=slow.next;
	        fast=fast.next.next;
	        if(slow==fast)
	            break;
	    }
	    if(slow!=fast)
	        return 0;
	    int len=0;
	    Node stop=slow;
	    slow=slow.next;
	    while(slow!=stop)
	    {
	        len++;
	        slow=slow.next;
	    }
	    return len+1;
	    
    }
}
