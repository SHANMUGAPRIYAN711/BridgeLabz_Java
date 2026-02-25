package methods.level3;

class StudentScorecard {

    static char grade(double percent) {
        if (percent >= 80) return 'A';
        if (percent >= 70) return 'B';
        if (percent >= 60) return 'C';
        if (percent >= 50) return 'D';
        if (percent >= 40) return 'E';
        return 'R';
    }

    public static void main(String[] args) {

        int[][] marks = {
                {80, 70, 75},
                {60, 65, 55},
                {90, 85, 88}
        };

        for (int i = 0; i < marks.length; i++) {
            double percent = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            System.out.println("Percentage: " + percent +
                    ", Grade: " + grade(percent));
        }
    }
}
