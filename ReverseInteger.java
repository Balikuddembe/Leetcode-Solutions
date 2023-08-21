class ReverseInteger {
    public static int reverse(int x) {
        int reverse = 0;
        while(x != 0) {
            int lastDigit = x % 10;
            int newReversed = reverse * 10 + lastDigit;
            // Check for overflow
            if((newReversed-lastDigit)/10 != reverse) {
                return 0;
            }
            reverse = newReversed;
            x=x/10;
        }
        return reverse;
    }
    // Test code main method
    public static void main(String[]args) {
        int x =123;
        int res = reverse(x);
        System.out.println(res);
    }
}