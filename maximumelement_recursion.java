  
public class maxvalue{
	public static int max(int[] arr , int i,int max){
    	if(i == arr.length){
        	return max;
    	}
    	if(arr[i] <= max){
        	max = arr[i];
    	}
    	return max(arr,++i,max);
	}
	public static void main(String[] args){
    	int[] arr = {1,2,3,4,5};
    	System.out.print(max(arr,0,Integer.MAX_VALUE));
	}
}


