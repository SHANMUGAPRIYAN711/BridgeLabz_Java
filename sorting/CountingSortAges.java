package BridgeLabz_Java.sorting;

class CountingSortAges {

    static void countingSort(int[] ages) {

        int max = 18; // given constraint (10–18)
        int[] count = new int[max + 1];

        // count frequency
        for (int age : ages) {
            count[age]++;
        }

        // rebuild sorted array
        int index = 0;

        for (int i = 0; i <= max; i++) {

            while (count[i] > 0) {
                ages[index++] = i;
                count[i]--;
            }
        }
    }

    static void print(int[] arr) {
        for (int num : arr) System.out.print(num + " ");
    }

    public static void main(String[] args) {

        int[] ages = {15, 12, 18, 10, 14, 12};

        countingSort(ages);

        System.out.println("Sorted Ages:");
        print(ages);
    }
}
