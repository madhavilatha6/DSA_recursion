 	 public class factorial{
	public static int factorial(int num,int fact, int i){
    	if(i <= num){
        	fact*=i;
        	return factorial(num,fact,++i);
    	}
    	return fact;
	}
    
	public static void main(String[] args){
    	int num = 7;
    	int fact = 1;
    	int i=1;
    	System.out.print(factorial(num,fact,i));
	}
}

