package BinarySearchOn2DArrays;

public class Q1_SearchIn2DMatrix {
    static boolean searchMatrix(int[][] matrix, int target) {
        // Number of rows and columns in the matrix
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Treat the matrix as a flattened sorted array
        // low and high represent the start and end indices of this virtual 1D array
        int low = 0;
        int high = rows * cols - 1;

        // Standard binary search
        while (low <= high) {
            // Avoid overflow by using this way to find mid
            int mid = low + (high - low) / 2;

            // Convert 1D index 'mid' to 2D indices (row, col)
            int row = mid / cols; // integer division gives the row number
            int col = mid % cols; // remainder gives the column number

            // Get the middle value
            int midValue = matrix[row][col];

            // If target is found, return true
            if (midValue == target) {
                return true;
            }
            // If target is larger, search in the right half
            else if (midValue < target) {
                low = mid + 1;
            }
            // If target is smaller, search in the left half
            else {
                high = mid - 1;
            }
        }

        // Target not found
        return false;
    }
    public static void main(String[] args){
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        System.out.println("Search 3: " + searchMatrix(matrix, 3));   // true
        System.out.println("Search 16: " + searchMatrix(matrix, 16)); // true

        System.out.println("Search 2: " + searchMatrix(matrix, 2));   // false
        System.out.println("Search 15: " + searchMatrix(matrix, 15)); // false

        System.out.println("Search 0: " + searchMatrix(matrix, 0));   // false
        System.out.println("Search 61: " + searchMatrix(matrix, 61)); // false
    }
}
