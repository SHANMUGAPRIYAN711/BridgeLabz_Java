package BridgeLabz_Java.sorting;

class QuickSortProducts {

    static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high]; // taking last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {
                i++;

                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot at correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    static void print(int[] arr) {
        for (int num : arr) System.out.print(num + " ");
    }

    public static void main(String[] args) {

        int[] prices = {500, 200, 800, 100, 300};

        quickSort(prices, 0, prices.length - 1);

        System.out.println("Sorted Product Prices:");
        print(prices);
    }
}
