package BridgeLabz_Java.sorting;

class MergeSortBooks {

    static void mergeSort(int[] arr, int left, int right) {

        if (left >= right) return;

        int mid = (left + right) / 2;

        // divide
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        // merge
        merge(arr, left, mid, right);
    }

    static void merge(int[] arr, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];

        int i = left;      // left half
        int j = mid + 1;  // right half
        int k = 0;

        // compare and merge
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // remaining elements
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        // copy back to original array
        for (int x = 0; x < temp.length; x++) {
            arr[left + x] = temp[x];
        }
    }

    static void print(int[] arr) {
        for (int num : arr) System.out.print(num + " ");
    }

    public static void main(String[] args) {

        int[] prices = {450, 120, 300, 200, 150};

        mergeSort(prices, 0, prices.length - 1);

        System.out.println("Sorted Book Prices:");
        print(prices);
    }
}
