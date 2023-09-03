public class Armstrong{
    public static void main(String[] args) {
        int num = 153;
        String str = "" + num;
        int len = str.length();
        AmstrongNumber(num, len);
    }

    public static void AmstrongNumber(int num, int len) {
        int sum = 0;
        int originalNum = num; // Store the original number before processing digits

        while (num > 0) {
            int rem = num % 10;
            sum += Math.pow(rem, len);
            num /= 10;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong Number");
        } else {
            System.out.println(originalNum + " is not an Armstrong number");
        }
    }
}
