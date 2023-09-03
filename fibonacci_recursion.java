

public class fibonacci_recursion {
    public static int fibonacci(int n,int n1,int n2,int n3,int i){
    	if(i == n){
      	return n3;
    	}
    	n3=n1+n2;
  	return  fibonacci(n , n2, n3 , n3 , ++i);
   	 
	}
    
	public static void main(String[] args){
   	 
 	int n=7;
 	int n1=0;
 	int n2=1;
 	int n3=n1+n2;
 	int i=2;
 	System.out.print(fibonacci(n,n1,n2,n3,i));
	}
}
