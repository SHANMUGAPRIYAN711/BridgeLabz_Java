package BridgeLabz_Java.sorting;

class BubbleSortMarks {

    // simple bubble sort logic
    static void sortMarks(int[] marks) {

        int n = marks.length;

        // outer loop controls number of passes
        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false; // to check if array is already sorted

            for (int j = 0; j < n - i - 1; j++) {

                // compare adjacent elements
                if (marks[j] > marks[j + 1]) {

                    // swap if order is wrong
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;

                    swapped = true;
                }
            }

            // if no swaps happened, array is sorted
            if (!swapped) break;
        }
    }

    static void print(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {

        int[] marks = {78, 45, 90, 32, 67};

        sortMarks(marks);

        System.out.println("Sorted Marks:");
        print(marks);
    }
}