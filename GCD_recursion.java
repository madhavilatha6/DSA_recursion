public class GCD{
	public static int commonNumber(int num1 , int num2 , int i , int  common){
    	if( i > num1 || i > num2){
        	return common;
    	}
    	if( num1 % i == 0 && num2 % i == 0){
        	common = i;
    	}
    	return commonNumber(num1 , num2 ,++i ,common);
	}
	public static void main(String[] args){
    	int num1 = 1;
    	int num2 = 70;
    	int i=1;
    	int common = 0;
    	System.out.print(commonNumber(num1,num2,i,common));
   	 
	}
}

