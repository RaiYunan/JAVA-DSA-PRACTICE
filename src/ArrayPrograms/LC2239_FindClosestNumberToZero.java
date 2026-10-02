package ArrayPrograms;

public class LC2239_FindClosestNumberToZero {

    // linear scan - track closest to zero, prefer positive on tie | O(n) time | O(1) space
    static int findClosestNumber(int[] nums) {
        int answer = nums[0];
        for (int num : nums)
            if (Math.abs(num) < Math.abs(answer) ||
                    (Math.abs(num) == Math.abs(answer) && num > answer)) answer = num;
        return answer;
    }

    void main() {
        System.out.println(findClosestNumber(new int[]{-4, -2, 1, 4, 8}));  // 1
        System.out.println(findClosestNumber(new int[]{2, -1, 1}));          // 1
        System.out.println(findClosestNumber(new int[]{-100000, -100000}));  // -100000
    }
}
