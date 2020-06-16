/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/
// complete the below function
class GfG {
    public static Node pairwiseSwap(Node node) {

        // add your code here
        Node curr=node;
        Node nex=node;
        while(curr!=null && curr.next!=null)
        {
            nex=curr.next;
            int tmp=curr.data;
            curr.data=nex.data;
            nex.data=tmp;
            curr=curr.next.next;
        }
        return node;
    }
}
