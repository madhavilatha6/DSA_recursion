class Node {

	int data;
	Node next;
    
}

public class Linkedlist
{
    static Node previous = null;
    static Node current = null;
    static Node first = null;
    
    public static void insert ( int data )
    {
   	 Node temp = new Node();
   	 temp.data = data;
   	 temp.next = null;
   	 
   	 if( first == null )
   	 {
   		 first = temp;
   		 return;
   	 }
   	 else{
   		 current = first;
   		 while ( current != null && current.data < temp.data )
   		 {
   		      previous = current;
   		      current = current.next;
   		  }
   	 } 
   	 
   	 //insert first
   	 
   	 if( current == null && previous == null && first != null )
   	 {
   		 temp.next = first;
   		 first = temp;
   		 return;
   	 }
   	 
   	 if( current != null && previous == null )
   	 {
   		 temp.next = current;
   		 first =temp;
   	 }
   	 
   	 //insert middle
   	 
   	 if( previous != null && current != null )
   	 {
   	      previous.next = temp;
   	      temp.next = current;
   	      return;
   	 }
   	 
   	 //insert end
   	 
   	 if( current == null && previous != null )
   	 {
   		 previous.next = temp;
   		 temp = current;
   		 return;
   	 }
    }
    
    
     public static Node reverse(Node first) {
   	 if (first == null || first.next == null) {
   	 	return first;
   	 }

   	 Node previous = first;
   	 Node current = previous.next;
   	 previous.next = null;

   	 while (current != null) {
   	 	Node temp = current;
   	 	current = current.next;
   	 	temp.next = previous;
   	 	previous = temp;
   	 }
   	 return previous;
      }
      
   	 
    public static void display()
    {
   	 Node traverse = first;
   	 while ( traverse != null )
   	 {
   		 System.out.println( traverse.data );
   		 traverse = traverse.next;
   	 }
   	 
    }
    
    public static void main ( String[] args)
    {
   	 Linkedlist.insert(1);
   	 Linkedlist.insert(4);
   	 Linkedlist.insert(6);
   	 Linkedlist.insert(2);
   	 Linkedlist.insert(5);
   	 Linkedlist.insert(8);
   	 Linkedlist.insert(7);
   	 Linkedlist.insert(9);
   	 Linkedlist.display();
   	 
   	 System.out.println("Reverse Linked List");
   	 
   	 first = Linkedlist.reverse(first);
   		 Linkedlist.display();
    }
}
