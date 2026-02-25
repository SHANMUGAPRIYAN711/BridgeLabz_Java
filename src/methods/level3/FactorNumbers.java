package methods.level3;

class FactorNumbers {

    static int[] factors(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) c++;
        int[] f = new int[c];
        int k = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) f[k++] = i;
        return f;
    }

    static boolean isPerfect(int n, int[] f) {
        int sum = 0;
        for (int x : f) if (x != n) sum += x;
        return sum == n;
    }

    static boolean isStrong(int n) {
        int sum = 0, t = n;
        while (t > 0) {
            int d = t % 10, fact = 1;
            for (int i = 1; i <= d; i++) fact *= i;
            sum += fact;
            t /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        int n = 145;
        int[] f = factors(n);
        System.out.println("Perfect: " + isPerfect(n, f));
        System.out.println("Strong: " + isStrong(n));
    }
}
