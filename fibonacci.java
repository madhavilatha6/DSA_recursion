public class fibonacci {
    public static void main(String[] args) {
        int numTerms = 10;
        int a = 0, b = 1;
        for (int i = 1; i <= numTerms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
