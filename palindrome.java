public class palindrome {
    public static void main(String[] args){
        String str = "madam";
        char[] string = str.toCharArray();
        int start =0;
        int end =string.length-1;
        while(start <= end){
            char temp = string[start];
            string[end] = string[end];
            string[end] = temp;

            start++;
            end--;
        }
       String reverse = new String(string);
       if(str.equals(reverse)){
        System.out.print("palindrome");
       }else{
        System.out.print("not palindrome");
       }
    }
}
