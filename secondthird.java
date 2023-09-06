class secondthird{
    public static void main ( String[] args){
        int[] arr = { 1,2,3,4,5,6};
        largest(arr);
        smallest(arr);
    }
    public static void largest(int[] arr){
        int first = arr[0];
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
        if (arr[i] > first){
            third = second;
            second = first;
            first = arr[i];
        }else if (arr[i] > second){
            third = second;
            second = arr[i];
        }else if(arr[i] > third){
            third = arr[i]; 
        }
        }
        System.out.print(third);
    }
    public static void smallest(int[] arr){
        int first = arr[0];
        int second = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] < first){
                second = first;
                first = arr[i];
            }else{
                second = first;
            }
        }
        System.out.print(second);
    }
}















