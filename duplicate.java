public class duplicate {
    public static void main(String[] args){
        int[] arr = {1,1,2,2,3,3,4,4,5,5};
        int count = 0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count+=1;
                    break;
                }
            }
        }
        System.out.print(count);
    }
}
