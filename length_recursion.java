 public class lengthString{
	public static int LengthStr(String str,int i,int count){
    	if(i == str.length()){
        	return count;
    	}
   	return LengthStr(str,++i,++count);
   	 
	}
	public static void main(String[] args){
    	String str="madhavi latha";
    	int i=0;
    	int count=0;
    	System.out.print(LengthStr(str,i,count));
	}
}
   	

