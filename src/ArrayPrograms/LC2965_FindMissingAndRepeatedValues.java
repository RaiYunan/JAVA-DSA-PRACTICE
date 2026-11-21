package ArrayPrograms;
import java.util.Arrays;

public class LC2965_FindMissingAndRepeatedValues {

    // O(n^2) time | O(n^2) space
    static int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] freq = new int[n * n + 1];
        for (int[] row : grid)
            for (int num : row) freq[num]++;
        int repeated = 0, missing = 0;
        for (int i = 1; i <= n * n; i++) {
            if (freq[i] == 2) repeated = i;
            if (freq[i] == 0) missing = i;
        }
        return new int[]{repeated, missing};
    }

    void main() {
        System.out.println(Arrays.toString(findMissingAndRepeatedValues(new int[][]{{1, 3}, {2, 2}})));                 // [2, 4]
        System.out.println(Arrays.toString(findMissingAndRepeatedValues(new int[][]{{9, 1, 7}, {8, 9, 2}, {3, 4, 6}}))); // [9, 5]
    }
}
