public class sumdigit_recursion {
    public static int positiveint( int num , int i , int sum , int rem)
	{
    	if (i>num)
    	{
        	return sum;
    	}
    	rem = num % 10;
    	sum = sum + rem;
    	num = num / 10;
   	 
    	return positiveint ( num , ++i , sum , rem);
	}
	public static void main(String[] args)
	{
    	int num = 25;
    	int i = 0;
    	int sum = 0;
    	int rem = 0;
    	System.out.print(positiveint( num , i , sum , rem));
	}
}
