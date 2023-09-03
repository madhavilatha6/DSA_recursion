class sumDigit{
public static void main ( String[] args)
{
    int sum = 0;
    int rem = 0;
    int num = 25;
    while ( num > 0){
     rem = num % 10;
    sum += rem;
    num = num / 10;
    }
    System.out.print(sum);
}

}
