public class sumofeven_recursion {
    public static int number (int[] arr , int i ,int sum,int size){
    	if(i == size ){
        	return  sum;
    	}
    	if(arr[i] % 2== 0){
        	sum = sum + arr[i];
    	}
    	return number(arr,i+1,sum,size);
	}
	public static void main(String[] args){
    	int[] arr = {1,2,3,4,5};
    	System.out.print(number(arr,0,0,arr.length));
	}
}
