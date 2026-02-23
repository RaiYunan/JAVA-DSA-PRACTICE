package BitManipulation;

import java.util.Arrays;

public class LC338_CountingBits {
    static int[] countBits(int n) {

        int[] ans = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            ans[i] = countOnes(i);
        }

        return ans;
    }

    // Count number of 1 bits in a number
    static int countOnes(int num) {

        int count = 0;

        while (num > 0) {

            // check last bit
            if ((num & 1) == 1) {
                count++;
            }

            // right shift
            num >>= 1;
        }

        return count;
    }
    void main(){
        int n=3;
        System.out.println(Arrays.toString(countBits(n)));
    }
}
