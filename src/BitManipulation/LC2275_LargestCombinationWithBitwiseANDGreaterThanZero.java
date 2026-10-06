package BitManipulation;
public class LC2275_LargestCombinationWithBitwiseANDGreaterThanZero {

    // O(24n) time | O(1) space
    static int largestCombination(int[] candidates) {
        int answer = 0;
        for (int bit = 0; bit < 24; bit++) {
            int count = 0;
            for (int num : candidates) if ((num & (1 << bit)) != 0) count++;
            answer = Math.max(answer, count);
        }
        return answer;
    }

    void main() {
        System.out.println(largestCombination(new int[]{16, 17, 71, 62, 12, 24, 14})); // 4
        System.out.println(largestCombination(new int[]{8, 8}));                        // 2
    }
}
