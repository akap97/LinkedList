import java.util.*;
import java.lang.*;
import java.io.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
class GFG
 {  
	public static void main (String[] args)
	 {
	    
	Scanner s=new Scanner(System.in);
	int t=s.nextInt();
	while(t-->0){
	     Node head=null,tail=null;
	    int n=s.nextInt();
	    for(int i=0;i<n;i++){
	        Node temp=new Node(s.nextInt());
	        if(head==null){
	        head=temp;
	        tail=temp;
	        }
	        else{
	         tail.next=temp;
	         tail=temp;
	        }
	    }
	    Node temp=oddEven(head);
	    while(temp!=null){
	        System.out.print(temp.data+" ");
	        temp=temp.next;
	    }
	     System.out.println();
	}
  }
     public static Node oddEven(Node head){
         Node evenH=null,evenT=null,cur=head,pre=null,odd=null;
         while(cur!=null){
             if(cur.data%2==0){
                 if(evenH==null){
                     if(odd==null){
                     evenH=cur;
                     evenT=cur;
                     pre=cur;
                     cur=cur.next;
                     }
                     else{
                      Node temp=cur;
                      pre.next=cur.next;
                      cur=cur.next;
                      evenH=temp;
                      evenT=temp;
                      temp.next=null;
                      evenT.next=odd;
                     }
                 }
                 else {
                     if(odd!=null){
                      Node temp=cur;
                      pre.next=cur.next;
                      cur=cur.next;
                      temp.next=null;
                      evenT.next=temp;
                      evenT=temp;
                      evenT.next=odd;
                     }
                     else{
                         evenT.next=cur;
                         evenT=cur;
                         pre=cur;
                         cur=cur.next;
                     }
                 }
             }
             else{ 
                 if(odd==null){
                 if(evenH==null){
                     odd=cur;
                     pre=cur;
                     cur=cur.next;
                    }else{
                        odd=cur;
                        evenT.next=odd;
                        pre=cur;
                     cur=cur.next;
                    }
                 }
                 else{
                     pre=cur;
                     cur=cur.next;
                 }
             }
         }
         if(evenH==null)return head;
         else
         return evenH;
     }
 
}
