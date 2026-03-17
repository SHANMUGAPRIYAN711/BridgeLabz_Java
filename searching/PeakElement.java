package BridgeLabz_Java.searching;

class PeakElement {

    static int findPeak(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            // if mid is smaller than next, peak is on right
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                // otherwise peak is on left side (including mid)
                right = mid;
            }
        }

        return left; // peak index
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 4, 2};

        int index = findPeak(arr);

        System.out.println("Peak element: " + arr[index]);
    }
}
