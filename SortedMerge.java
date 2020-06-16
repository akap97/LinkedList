class LinkedList
{
    Node sortedMerge(Node headA, Node headB) {
     // This is a "method-only" submission. 
     // You only need to complete this method
     Node result=null;
    if(headA==null)
        return headB;
    if(headB==null)
        return headA;
    if(headA.data<=headB.data)
        {
            result=headA;
            result.next=sortedMerge(headA.next,headB);
        }
    else {
        result=headB;
        result.next=sortedMerge(headA,headB.next);
    }
    return result;
   } 
   
}
