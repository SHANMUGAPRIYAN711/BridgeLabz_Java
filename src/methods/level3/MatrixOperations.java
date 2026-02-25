package methods.level3;

class MatrixOperations {

    static int[][] add(int[][] a, int[][] b) {
        int[][] sum = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                sum[i][j] = a[i][j] + b[i][j];

        return sum;
    }

    static int[][] transpose(int[][] m) {
        int[][] t = new int[m[0].length][m.length];

        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                t[j][i] = m[i][j];

        return t;
    }

    static void print(int[][] m) {
        for (int[] row : m) {
            for (int x : row)
                System.out.print(x + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};

        System.out.println("Matrix Addition:");
        print(add(a, b));

        System.out.println("Matrix Transpose:");
        print(transpose(a));
    }
}
