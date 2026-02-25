package methods.level3;

class ReversePalindrome {

    static int reverse(int n) {
        int r = 0;
        while (n > 0) {
            r = r * 10 + n % 10;
            n /= 10;
        }
        return r;
    }

    static boolean isPalindrome(int n) {
        return n == reverse(n);
    }

    public static void main(String[] args) {
        int n = 121;
        System.out.println("Reverse: " + reverse(n));
        System.out.println("Palindrome: " + isPalindrome(n));
    }
}
