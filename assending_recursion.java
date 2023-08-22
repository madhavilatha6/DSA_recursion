public  class asending{
    public static boolean accendingorder(int[] arr , int index )
    {
   	 if ( index >= arr.length-1 )
   	 {
   		 return true;
   	 }
   	 
   	 if ( index > arr[index + 1] )
   	 {
   		 return false;
   	 }
   	 
   	 return accendingorder ( arr , index+1 );
    }
    public static void main (String[] args)
    {
   	 int[] arr = {1,2,3,4,5};
   	 System.out.print(accendingorder(arr , 0));
    }
}


