class Node
{
    int data;
    Node next;
}

public class Stack
{
    static Node top = null;
    public static void push(int data)
    {
   	 Node temp = new Node();
   	 temp.data=data;
   	 temp.next=null;
   	 if(top == null)
   	 {
   		 top=temp;
   	 }
   	 else{
   		 temp.next=top;
   		 top=temp;
   	 }
    }
    public static void displayStack(){
   	 Node traverse = top;
   	 while(traverse != null){
   		 System.out.println(traverse.data);
   		 traverse=traverse.next;
   	 }
    }
    public static void pop(){
   	 Node temp=top;
   	 top=top.next;
   	 temp.next=null;
   	 System.out.print(temp.data);
    }
    
    
    public static void main(String[] args)
    {
   	 
   	 Stack.push(10);
   	 Stack.push(20);
   	 Stack.push(30);
   	 Stack.push(40);
   	 Stack.push(50);
   	 Stack.push(60);
   	 Stack.push(70);
   	 Stack.pop();
   	 Stack.pop();
   	 Stack.displayStack();
   	 
    }
}
