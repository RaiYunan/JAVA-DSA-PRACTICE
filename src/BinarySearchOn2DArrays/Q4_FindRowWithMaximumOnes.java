package BinarySearchOn2DArrays;

public class Q4_FindRowWithMaximumOnes {
    // Function to return index of the row with the maximum number of 1s
    static int rowWithMax1s(int[][] matrix, int n, int m) {
        int rowIndex = -1;     // row with max 1s
        int j = m - 1;         // start from top-right column

        // Start from row 0, column m-1
        for (int i = 0; i < n; i++) {
            // Move left while there are 1s
            while (j >= 0 && matrix[i][j] == 1) {
                rowIndex = i;  // current row has more 1s
                j--;           // move left to see if 1 appears earlier
            }
        }

        return rowIndex;
    }
    public static void main(String[] args){
        int[][] arr={
                {0,0,1,1,1},
                {1,1,1,1,1},
                {0,1,1,1,1},
                {0,0,0,0,0},
                {0,1,1,1,1}
        };

        int ans=rowWithMax1s(arr,arr.length,arr[0].length);
        System.out.println("The row with maximum no. of 1's is: " + ans);
    }
}
