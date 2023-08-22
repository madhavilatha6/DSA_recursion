public class Recursion {
	public static int SumRecursion(int[] arr, int i, int size, int sum) {
    	if (i == size) {
        	return sum;
    	}
    	sum = sum + arr[i];
    	return SumRecursion(arr, ++i, size, sum);
	}

	public static void main(String[] args) {
    	int[] arr = { 1,2,3,4,5 };
    	if(arr == null){
        	return;
    	}
    	System.out.print(SumRecursion(arr, 0, arr.length, 0));
	}
}

