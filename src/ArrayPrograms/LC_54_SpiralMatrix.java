package ArrayPrograms;

import java.util.ArrayList;
import java.util.List;

public class LC_54_SpiralMatrix {

      static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;

        while (top <= bottom && left <= right) {

            // Traverse top row (left → right)
            for (int col = left; col <= right; col++) {
                result.add(matrix[top][col]);
            }
            top++;

            // Traverse right column (top → bottom)
            for (int row = top; row <= bottom; row++) {
                result.add(matrix[row][right]);
            }
            right--;

            // Traverse bottom row (right → left)
            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    result.add(matrix[bottom][col]);
                }
                bottom--;
            }

            // Traverse left column (bottom → top)
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    result.add(matrix[row][left]);
                }
                left++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("3x3: " + spiralOrder(matrix1));

        int[][] matrix2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        System.out.println("3x4: " + spiralOrder(matrix2));

        int[][] matrix3 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        System.out.println("4x3: " + spiralOrder(matrix3));

        int[][] matrix4 = {{1, 2, 3, 4, 5}};
        System.out.println("1x5: " + spiralOrder(matrix4));

        int[][] matrix5 = {{1}, {2}, {3}, {4}};
        System.out.println("4x1: " + spiralOrder(matrix5));

        int[][] matrix6 = {};
        System.out.println("Empty: " + spiralOrder(matrix6));
    }
}
