package ArrayPrograms;

/**
 * Brute Force Solution
 * Uses extra space to track rows and columns to be zeroed.
 */
public class LC_73_SetMatrixZeroes {

    static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] zeroRow = new boolean[m];
        boolean[] zeroCol = new boolean[n];

        // Step 1: Mark rows and columns that contain 0
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    zeroRow[i] = true;
                    zeroCol[j] = true;
                }
            }
        }

        // Step 2: Set marked rows to 0
        for (int i = 0; i < m; i++) {
            if (zeroRow[i]) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 3: Set marked columns to 0
        for (int j = 0; j < n; j++) {
            if (zeroCol[j]) {
                for (int i = 0; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

}
