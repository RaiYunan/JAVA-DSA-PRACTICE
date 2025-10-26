package BinarySearchOn2DArrays;

public class Q2_SearchInRowWiseAndColumnWiseMatrix {

    // Search in a matrix where each row and column is sorted in ascending order
    static boolean searchMatrix(int[][] matrix, int target) {
        // Edge case: empty or null matrix
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Start from top-right corner
        int row = 0;
        int col = cols - 1;

        // Traverse until you go out of bounds
        while (row < rows && col >= 0) {
            int current = matrix[row][col];

            if (current == target) {
                return true; // Found target
            } else if (target < current) {
                col--; // Move left if target is smaller
            } else {
                row++; // Move down if target is larger
            }
        }

        // Target not found
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        // Test cases
        System.out.println(searchMatrix(arr, 37)); // true - element in middle
        System.out.println(searchMatrix(arr, 10)); // true - first element
        System.out.println(searchMatrix(arr, 50)); // true - last element
        System.out.println(searchMatrix(arr, 15)); // true - found in 2nd row
        System.out.println(searchMatrix(arr, 51)); // false - not present

    }
}
