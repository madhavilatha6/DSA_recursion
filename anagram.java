public class anagram {
    public static void main(String[] args){
        String str1 ="madhu";
        String str2 = "uhdam";

        char[] A = str1.toCharArray();
        char[] B = str2.toCharArray();

        if ( A.length != B.length){
            System.out.print("not anagram");
        }else{
            int count =0;
            for(int i=0;i<A.length;i++){
                for(int j=0;j<B.length;j++){
                    if(A[i] == B[j] && A[i] != '!'){
                        count+=1;
                        // break;
                    }
                }
            }
            if(A.length == count){
                System.out.print("Anagram");
            }else{
                System.out.print("not anagram");
            }
        }
    }
}
