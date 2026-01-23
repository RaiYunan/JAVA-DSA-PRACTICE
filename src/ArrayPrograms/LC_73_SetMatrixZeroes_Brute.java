package ArrayPrograms;

/*
 * LeetCode 73 - Set Matrix Zeroes

 * Brute Force Solution
 * Uses extra space to track which rows and columns should be set to zero.

 * Time Complexity  : O(m * n)
 * Space Complexity : O(m + n)
 */
public class LC_73_SetMatrixZeroes_Brute {

    static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] zeroRow = new boolean[m];
        boolean[] zeroCol = new boolean[n];

        // Step 1: Identify rows and columns that contain 0
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    zeroRow[i] = true;
                    zeroCol[j] = true;
                }
            }
        }

        // Step 2: Set entire rows to 0
        for (int i = 0; i < m; i++) {
            if (zeroRow[i]) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 3: Set entire columns to 0
        for (int j = 0; j < n; j++) {
            if (zeroCol[j]) {
                for (int i = 0; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    // Utility method to print matrix
    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        setZeroes(matrix);

        System.out.println("\nMatrix After Setting Zeroes:");
        printMatrix(matrix);
    }
}
