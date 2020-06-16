/* The structure of linked list is the following
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}
*/

class GfG
{
    // Function to remove duplicates from the given linked list
    public Node removeDuplicates(Node head) 
    {
         // Your code here
         if(head==null)
            return null;
        if(head.next==null)
            return head;
         HashSet<Integer> h=new HashSet<>();
         Node prev=null,curr=head;
         while(head!=null)
         {
             if(!h.contains(head.data))
             {
                 h.add(head.data);
             }
             else {
                 prev.next=head.next;
                 head=prev;
             }
             prev=head;
             head=head.next;
         }
         return curr;
    }
}
