public class sumofelement_recursion {
    public static int SumRecursion(int[] arr, int i, int size, int sum) {
    	if (i == size) {
        	return sum;
    	}
    	sum = sum + arr[i];
    	return SumRecursion(arr, ++i, size, sum);
	}

	public static void main(String[] args) {
    	int[] arr = { 1,2,3,4,5 };
    	System.out.print(SumRecursion(arr,0, arr.length,0));
	}
}
