package BinarySearchOn2DArrays;

//https://leetcode.com/problems/find-a-peak-element-ii

public class Q3_FindPeakIn2DMatrix {
    static int[] findPeakGrid(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int start = 0;
        int end = cols - 1;

        while (start <= end) {
            // Pick the middle column
            int midCol = start + (end - start) / 2;

            // Find the row index of the maximum element in this column
            int maxRow = 0;
            for (int i = 0; i < rows; i++) {
                if (mat[i][midCol] > mat[maxRow][midCol]) {
                    maxRow = i;
                }
            }

            int midValue = mat[maxRow][midCol];

            // Safely get left and right neighbors (treat edges as -1)
            int leftNeighbor = (midCol - 1 >= 0) ? mat[maxRow][midCol - 1] : -1;
            int rightNeighbor = (midCol + 1 < cols) ? mat[maxRow][midCol + 1] : -1;

            // If current element is greater than both neighbors, it's a peak
            if (midValue > leftNeighbor && midValue > rightNeighbor) {
                return new int[]{maxRow, midCol};
            }

            // Move towards the greater neighbor side (like binary search)
            if (rightNeighbor > midValue) {
                start = midCol + 1; // move right
            } else {
                end = midCol - 1; // move left
            }
        }

        // Should never reach here if input is valid
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[][] mat = {
                {4, 2, 5, 1, 4, 5},
                {2, 9, 3, 2, 3, 2},
                {1, 7, 6, 0, 1, 3},
                {3, 6, 2, 3, 7, 2}
        };


        int[] peak = findPeakGrid(mat);

        System.out.println("The row of the peak element is " + peak[0] +
                " and the column of the peak element is " + peak[1]);
    }
}
