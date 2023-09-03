public class palindrome_recursion {
    public static void ReversePalindrome(int start , int end , char[] string)
    {
   	 if(start >= end){
   		 return;
   	 }
   		 char temp = string[start];
   		 string[start] = string[end];
   		 string[end] = temp;
    
   		 ReversePalindrome(start+1 , end-1 , string);
   	 
    }
    public static void main(String[] args){
   	 String str = "madhavi";
   	 char[] string = str.toCharArray();
    	ReversePalindrome(0,string.length-1,string);
    	String rev = new String(string);
   		 if( str.equals(rev)){
   		 	System.out.println("palindrome");
   		 }
   		 else{
   		 	System.out.println("not palindrome"+" ");
   		 }
   	 System.out.print(string);
    }
    
}
