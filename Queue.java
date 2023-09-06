class Node {

	int data;
	Node next;
    
}

public class Queue {

 
	static Node first = null;

	public static void queue(int data) {
    
    	Node temp = new Node();
    	temp.data = data;
    	temp.next = null;
    	if (first == null) {
        	first = temp;
        	return;
    	}
   	 
     	Node traverse = first;

    	while(traverse.next != null)
    	{
        	traverse = traverse.next;
    	}

    	traverse.next = temp;
   	 
   	 
	}

	public static void displayQueue() {
    
    	Node traverse = first;
    	while (traverse != null) {
        	System.out.println(traverse.data);
        	traverse = traverse.next;
    	}
	}

	public static void dequeue() {
    	if (first == null) {
        	return;
    	}
    	 Node temp = first;
    	while(temp.next != null){
   		 /*first = first.next;*/
   		 temp = temp.next;
    	}
    	temp.next = null;	
}
    
   public static void main(String[] args) {
    	Queue.queue(10);
    	Queue.queue(20);
    	Queue.queue(30);
    	Queue.queue(40);
    	Queue.queue(50);
    	Queue.queue(60);
    	Queue.queue(70);
  	Queue.queue(80);
    	Queue.displayQueue();
	}
}
