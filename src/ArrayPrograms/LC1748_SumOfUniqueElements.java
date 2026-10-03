package ArrayPrograms;

public class LC1748_SumOfUniqueElements {

    // O(n) time | O(1) space
    static int sumOfUnique(int[] nums) {
        int[] freq = new int[101];
        for (int num : nums) freq[num]++;
        int sum = 0;
        for (int num : nums) if (freq[num] == 1) sum += num;
        return sum;
    }

    void main() {
        System.out.println(sumOfUnique(new int[]{1, 2, 3, 2}));       // 4
        System.out.println(sumOfUnique(new int[]{1, 1, 1, 1, 1}));    // 0
        System.out.println(sumOfUnique(new int[]{1, 2, 3, 4, 5}));    // 15
    }
}
