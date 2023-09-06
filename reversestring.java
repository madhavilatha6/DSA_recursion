public class reversestring {
    public static void main(String[] args){
        String str = "madhavilatha";
        char[] string = str.toCharArray();
        int start = 0;
        int end = string.length-1;
        while(start < end){
        char temp = string[start];
        string[start] = string[end];
        string[end] = temp;

        start++;
        end--;
        }
        System.out.print(string);

    }
}
