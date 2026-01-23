package ArrayPrograms;

import java.util.Arrays;

public class LC_66_PlusOne {

    static int[] plusOne1(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        return newDigits;
    }

    static int[] plusOne2(int[] digits) {
        int i = digits.length - 1;

        while (i >= 0 && digits[i] == 9) {
            digits[i] = 0;
            i--;
        }

        if (i >= 0) {
            digits[i]++;
            return digits;
        } else {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
    }

    public static void main(String[] args) {

        int[][] testCases = {
                {1, 2, 3},
                {1, 2, 9},
                {9},
                {9, 9, 9},
                {4, 3, 2, 1}
        };

        System.out.println("Testing plusOne1:");
        for (int[] test : testCases) {
            int[] input = Arrays.copyOf(test, test.length);
            int[] result = plusOne1(input);
            System.out.println("Input: " + Arrays.toString(test) +
                    " -> Output: " + Arrays.toString(result));
        }

        System.out.println("\nTesting plusOne2:");
        for (int[] test : testCases) {
            int[] input = Arrays.copyOf(test, test.length);
            int[] result = plusOne2(input);
            System.out.println("Input: " + Arrays.toString(test) +
                    " -> Output: " + Arrays.toString(result));
        }
    }
}
