package BridgeLabz_Java.runtimeanalysis;

class FibonacciComparison {

    // Recursive -> O(2^N)
    static int fibRecursive(int n) {
        if (n <= 1) return n;
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    // Iterative -> O(N)
    static int fibIterative(int n) {

        if (n <= 1) return n;

        int a = 0, b = 1;

        for (int i = 2; i <= n; i++) {

            int sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {

        int n = 10;

        long start1 = System.nanoTime();
        System.out.println("Recursive: " + fibRecursive(n));
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        System.out.println("Iterative: " + fibIterative(n));
        long end2 = System.nanoTime();

        System.out.println("Recursive Time: " + (end1 - start1));
        System.out.println("Iterative Time: " + (end2 - start2));
    }
}
