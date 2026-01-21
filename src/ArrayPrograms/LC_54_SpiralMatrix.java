package ArrayPrograms;
import java.util.ArrayList;
import java.util.List;

public class LC_54_SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix.length == 0) return res;

        int rowBegin = 0, rowEnd = matrix.length - 1;
        int colBegin = 0, colEnd = matrix[0].length - 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            // Right
            for (int j = colBegin; j <= colEnd; j++)
                res.add(matrix[rowBegin][j]);
            rowBegin++;

            // Down
            for (int j = rowBegin; j <= rowEnd; j++)
                res.add(matrix[j][colEnd]);
            colEnd--;

            // Left
            if (rowBegin <= rowEnd) {
                for (int j = colEnd; j >= colBegin; j--)
                    res.add(matrix[rowEnd][j]);
                rowEnd--;
            }

            // Up
            if (colBegin <= colEnd) {
                for (int j = rowEnd; j >= rowBegin; j--)
                    res.add(matrix[j][colBegin]);
                colBegin++;
            }
        }

        return res;
    }

    public static void main(String[] args){
        LC_54_SpiralMatrix solution = new LC_54_SpiralMatrix();

        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Test 1 (3x3): " + solution.spiralOrder(matrix1));


        int[][] matrix2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        System.out.println("Test 2 (3x4): " + solution.spiralOrder(matrix2));

        int[][] matrix3 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        System.out.println("Test 3 (4x3): " + solution.spiralOrder(matrix3));


        int[][] matrix4 = {{1, 2, 3, 4, 5}};
        System.out.println("Test 4 (1x5): " + solution.spiralOrder(matrix4));

        int[][] matrix5 = {{1}, {2}, {3}, {4}};
        System.out.println("Test 5 (4x1): " + solution.spiralOrder(matrix5));

        int[][] matrix6 = {};
        System.out.println("Test 6 (Empty): " + solution.spiralOrder(matrix6));

    }
}