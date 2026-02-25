package methods.level3;
class NumberChecker2 {

    static int sumDigits(int[] d) {
        int s = 0;
        for (int x : d) s += x;
        return s;
    }

    static double sumSquares(int[] d) {
        double s = 0;
        for (int x : d) s += Math.pow(x, 2);
        return s;
    }

    static boolean isHarshad(int n, int[] d) {
        return n % sumDigits(d) == 0;
    }

    static int[] frequency(int[] d) {
        int[] freq = new int[10];
        for (int x : d) freq[x]++;
        return freq;
    }

    public static void main(String[] args) {
        int n = 18;
        int[] d = NumberChecker.getDigits(n);

        System.out.println("Harshad: " + isHarshad(n, d));
        System.out.println("Sum of digits: " + sumDigits(d));
        System.out.println("Sum of squares: " + sumSquares(d));

        int[] f = frequency(d);
        for (int i = 0; i < f.length; i++)
            System.out.println(i + " -> " + f[i]);
    }
}