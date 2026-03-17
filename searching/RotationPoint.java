package BridgeLabz_Java.searching;

class RotationPoint {

    static int findRotationPoint(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // safer way to find mid (avoids overflow)
            int mid = left + (right - left) / 2;

            // if mid element is greater than right,
            // smallest is definitely on right side
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                // otherwise it's on left (including mid)
                right = mid;
            }
        }

        // left will be pointing to smallest element
        return left;
    }

    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7, 1, 2, 3};

        int index = findRotationPoint(arr);

        System.out.println("Rotation point index: " + index);
        System.out.println("Smallest element: " + arr[index]);
    }
}