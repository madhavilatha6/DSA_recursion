public class paragraphcount {
    public static void main (String[] args){
        String str = "my name is madhavilatha. and i'm from palamaner ";
        int words = 0;
        int sentence = 0;
        int letter = 0;
        
        for(int i=0;i< str.length();i++){
            if(str.charAt(i) == ' '){
                words++;
            }else if(str.charAt(i) == '.'){
                sentence++;
            }else if(str.charAt(i) != ' '){
                letter++;
            }
        }

        if(str.charAt(str.length()-1) != ' ' ){
            words++;
        }else if(str.charAt(str.length()-1) == ' '){
            sentence++;
        }

        
        System.out.print(words+" ");
        System.out.print(sentence+" ");
        System.out.print(letter+" ");
    }
}
