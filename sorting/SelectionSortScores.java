package BridgeLabz_Java.sorting;

class SelectionSortScores {

    static void sortScores(int[] scores) {

        for (int i = 0; i < scores.length - 1; i++) {

            int minIndex = i;

            // find smallest element
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            // swap
            int temp = scores[i];
            scores[i] = scores[minIndex];
            scores[minIndex] = temp;
        }
    }

    static void print(int[] arr) {
        for (int num : arr) System.out.print(num + " ");
    }

    public static void main(String[] args) {

        int[] scores = {88, 55, 99, 70, 65};

        sortScores(scores);

        System.out.println("Sorted Exam Scores:");
        print(scores);
    }
}