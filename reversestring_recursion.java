public class reverseString{
	public static void Reverse(int start , int end , char[] string)
	{
    	if(start >= end){
        	return;
    	}
        	char temp = string[start];
        	string[start] = string[end];
        	string[end] = temp;
        	Reverse(start+1 , end-1 , string);
	}
	public static void main(String[] args){
    	String str = "madhavi latha";
    	char[] string = str.toCharArray();
    	Reverse(0,string.length-1,string);
    	System.out.print(string);
	}
    
}



