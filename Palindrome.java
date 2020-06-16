class Palindrome
{
    // Function to check if linked list is palindrome
    boolean isPalindrome(Node head) 
    {
       //Your code here
       if(head.next==null)
            return true;
       Node slow=head,fast=head,prev=null;
       while(fast!=null && fast.next!=null)
       {
           prev=slow;
           slow=slow.next;
           fast=fast.next.next;
       }
       prev.next=null;
       Node otherhalf=reverse(slow);
       Node curr=head;
       while(curr!=null)
       {
           if(curr.data!=otherhalf.data)
                return false;
            curr=curr.next;
            otherhalf=otherhalf.next;
       }
       return true;
       
    }
    Node reverse(Node head)
    {
        Node prev=null,next=null;
        while(head!=null)
        {
            next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
}
