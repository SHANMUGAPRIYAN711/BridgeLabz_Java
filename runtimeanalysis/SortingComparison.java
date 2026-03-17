package BridgeLabz_Java.runtimeanalysis;

class SortingComparison {

    // Bubble Sort -> O(N^2)
    static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Merge Sort -> O(N log N)
    static void mergeSort(int[] arr, int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];

        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {

            if (arr[i] <= arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }

        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        // copy back
        for (int x = 0; x < temp.length; x++)
            arr[left + x] = temp[x];
    }

    static void print(int[] arr) {
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr1 = {5, 3, 8, 2};
        int[] arr2 = arr1.clone(); // copy for merge sort

        bubbleSort(arr1);
        System.out.print("Bubble Sort: ");
        print(arr1);

        mergeSort(arr2, 0, arr2.length - 1);
        System.out.print("Merge Sort: ");
        print(arr2);
    }
}
