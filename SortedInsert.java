/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/

// sortedInsert method should return the head of the modified linked list.
class Solution {
    Node sortedInsert(Node head1, int key) {
        // Add your code here.
        Node curr=head1;
        if(key<=head1.data)
        {
            Node newnode=new Node(key);
            newnode.next=head1;
            head1=newnode;
            return head1;
        }
        else
        {   Node prev=null;
            while(curr!=null && curr.data<=key)
            {
                prev=curr;
                curr=curr.next;
            }
                prev.next=new Node(key);
                prev=prev.next;
                prev.next=curr;
                return head1;
            }
            
    }
}
