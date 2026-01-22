package ArrayPrograms;
import java.util.ArrayList;
import java.util.List;

public class LC_54_SpiralMatrix {

    static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        if (matrix == null || matrix.length == 0) {
            return result;
        }

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            // 1. Left to Right
            for (int col = left; col <= right; col++) {
                result.add(matrix[top][col]);
            }
            top++;

            // 2. Top to Bottom
            for (int row = top; row <= bottom; row++) {
                result.add(matrix[row][right]);
            }
            right--;

            // 3. Right to Left
            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    result.add(matrix[bottom][col]);
                }
                bottom--;
            }

            // 4. Bottom to Top
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    result.add(matrix[row][left]);
                }
                left++;
            }
        }

        return result;
    }

    public static void main(String[] args){


        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Test 1 (3x3): " + spiralOrder(matrix1));


        int[][] matrix2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        System.out.println("Test 2 (3x4): " +spiralOrder(matrix2));

        int[][] matrix3 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        System.out.println("Test 3 (4x3): " + spiralOrder(matrix3));


        int[][] matrix4 = {{1, 2, 3, 4, 5}};
        System.out.println("Test 4 (1x5): " + spiralOrder(matrix4));

        int[][] matrix5 = {{1}, {2}, {3}, {4}};
        System.out.println("Test 5 (4x1): " + spiralOrder(matrix5));

        int[][] matrix6 = {};
        System.out.println("Test 6 (Empty): " + spiralOrder(matrix6));

    }
}