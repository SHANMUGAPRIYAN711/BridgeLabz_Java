package BridgeLabz_Java.searching;

class FirstNegativeSearch {

    static int findFirstNegative(int[] arr) {

        // go element by element
        for (int i = 0; i < arr.length; i++) {

            // the moment we see a negative, return index
            if (arr[i] < 0) {
                return i;
            }
        }

        // if nothing found
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {5, 10, 3, -2, 8};

        int index = findFirstNegative(arr);

        System.out.println("First negative index: " + index);
    }
}
