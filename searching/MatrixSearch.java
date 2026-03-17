package BridgeLabz_Java.searching;

class MatrixSearch {

    static boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            // convert 1D index to 2D position
            int r = mid / cols;
            int c = mid % cols;

            int value = matrix[r][c];

            if (value == target) {
                return true;
            } else if (value < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 3, 5},
                {7, 9, 11},
                {13, 15, 17}
        };

        System.out.println(searchMatrix(matrix, 9));
    }
}