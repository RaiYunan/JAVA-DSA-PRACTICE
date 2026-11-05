package StringPrograms;

import java.util.Arrays;

public class LC179_LargestNumber {

    // O(n log n) time | O(n) space
    static String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) arr[i] = String.valueOf(nums[i]);
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        if (arr[0].equals("0")) return "0";
        StringBuilder sb = new StringBuilder();
        for (String num : arr) sb.append(num);
        return sb.toString();
    }

    void main() {
        System.out.println(largestNumber(new int[]{10, 2}));              // 210
        System.out.println(largestNumber(new int[]{3, 30, 34, 5, 9}));    // 9534330
        System.out.println(largestNumber(new int[]{0, 0}));               // 0
    }
}