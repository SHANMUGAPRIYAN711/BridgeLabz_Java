package BridgeLabz_Java.sorting;

class InsertionSortEmployees {

    static void sortIDs(int[] ids) {

        for (int i = 1; i < ids.length; i++) {

            int current = ids[i];  // element to insert
            int j = i - 1;

            // shift elements greater than current
            while (j >= 0 && ids[j] > current) {
                ids[j + 1] = ids[j];
                j--;
            }

            // place element at correct position
            ids[j + 1] = current;
        }
    }

    static void print(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {

        int[] ids = {105, 102, 110, 101, 108};

        sortIDs(ids);

        System.out.println("Sorted Employee IDs:");
        print(ids);
    }
}