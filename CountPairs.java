// your task is to complete this function

/*
class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class GfG {

    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
                          int x) {
        // add your code here
        Set<Integer> h=new HashSet<>();
        int count=0;
        Iterator<Integer> l1= head1.iterator();
        while(l1.hasNext()) 
            h.add(x-(Integer)l1.next());
        Iterator<Integer> l2=head2.iterator();
        while(l2.hasNext()) {
            if(h.contains((Integer)l2.next()))
                count++;
        }
        return count;
    }
}
