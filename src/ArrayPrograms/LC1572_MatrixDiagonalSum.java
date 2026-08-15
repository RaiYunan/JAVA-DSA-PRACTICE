package Arrays;

public class LC1572_MatrixDiagonalSum {

    /*
     * sum both diagonals of a square matrix
     * 1. add primary diagonal mat[i][i] and secondary mat[i][n-1-i]
     * 2. if n is odd, center element is counted twice, subtract once
     *
     * single pass diagonal traversal
     * O(n) time, O(1) space
     */
    static int diagonalSum(int[][] mat) {
        int n = mat.length, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
            sum += mat[i][n - 1 - i];
        }
        if (n % 2 == 1) sum -= mat[n / 2][n / 2];
        return sum;
    }

    void main() {
        System.out.println(diagonalSum(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));         // 25
        System.out.println(diagonalSum(new int[][]{{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}})); // 8
        System.out.println(diagonalSum(new int[][]{{5}}));                              // 5
    }
}
