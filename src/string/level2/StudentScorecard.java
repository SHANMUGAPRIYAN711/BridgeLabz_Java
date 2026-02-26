package string.level2;

class StudentScorecard {

    static int[][] generateScores(int n) {
        int[][] m = new int[n][3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                m[i][j] = (int)(Math.random() * 100);
        return m;
    }

    static char grade(double p) {
        if (p >= 80) return 'A';
        if (p >= 70) return 'B';
        if (p >= 60) return 'C';
        if (p >= 50) return 'D';
        if (p >= 40) return 'E';
        return 'R';
    }

    public static void main(String[] args) {
        int[][] m = generateScores(5);

        for (int i = 0; i < m.length; i++) {
            int total = m[i][0] + m[i][1] + m[i][2];
            double percent = Math.round((total / 3.0) * 100) / 100.0;
            System.out.println(percent + " " + grade(percent));
        }
    }
}