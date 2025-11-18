package ArrayPrograms;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    // Method to generate Pascal's Triangle
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        if (numRows <= 0) return res;

        // First row is always [1]
        res.add(new ArrayList<>());
        res.get(0).add(1);

        // Build remaining rows
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = res.get(i - 1);
            List<Integer> currRow = new ArrayList<>();

            // First element
            currRow.add(1);

            // Middle elements
            for (int j = 1; j < i; j++) {
                int val = prevRow.get(j - 1) + prevRow.get(j);
                currRow.add(val);
            }

            // Last element
            currRow.add(1);

            res.add(currRow);
        }

        return res;
    }

    public static void main(String[] args) {
        int numRows = 6;

        List<List<Integer>> triangle = generate(numRows);

        // Print the triangle
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }
}
