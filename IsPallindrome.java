class IsPallindrome {
    public static boolean isPallindrome(int x) {
        if(x < 0) return false;
        int original = x;
        int rev = 0;
        int lastDig = 0;
        while(x!=0) {
            lastDig = x % 10;
            rev = rev * 10 + lastDig;
            x/=10;
        }
        return rev == original;
    }
}