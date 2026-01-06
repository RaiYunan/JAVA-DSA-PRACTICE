package ArrayPrograms;

public class LC_48_RotateMatrix90Degrees {
    /*
     * LeetCode 48 - Rotate Image
     * Rotate an n x n 2D matrix by 90 degrees (clockwise) in-place.

     * Approach:
     * 1. Transpose the matrix (swap matrix[i][j] with matrix[j][i])
     * 2. Reverse each row

     * Time Complexity: O(n²) where n is the matrix dimension
     * Space Complexity: O(1) in-place rotation
     */

    static void rotate(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    static void printMatrix(int[][] matrix) {

        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%3d", value);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        rotate(matrix);

        System.out.println("\nRotated Matrix (90° clockwise):");
        printMatrix(matrix);
    }
}